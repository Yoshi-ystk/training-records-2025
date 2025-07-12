import sqlite3

# ==============================================
# PythonでのSQLite操作（基礎）
# - execute, executemany による挿入
# - SELECTによるデータ抽出と条件検索
# - 主キー制約の挙動確認
# ==============================================

# ① 主キーなしテーブルの操作
# `Sample11.db` を使用して、テーブルの作成、データの挿入、検索を行う基本的な例です。

# データベースに接続 (ファイルが存在しない場合は新規作成)
conn1 = sqlite3.connect("Sample11.db")
# カーソルを取得
c1 = conn1.cursor()

# テーブルが存在しない場合のみ `product` テーブルを作成
c1.execute('''
CREATE TABLE IF NOT EXISTS product (name TEXT, num INTEGER)
''')

# データの挿入
# ※何度も実行すると同じデータが重複して挿入されるため、初回実行時のみ有効にするか、
#   以下のように主キーを設定して重複を避けるのが望ましいです。
try:
    products = [('みかん', 80), ('いちご', 60), ('りんご', 22), ('もも', 50), ('くり', 75)]
    c1.executemany("INSERT INTO product VALUES(?, ?)", products)
except sqlite3.IntegrityError as e:
    print(f"データ挿入済みのためスキップします: {e}")

# 変更をコミット
conn1.commit()

# 全商品データを表示
print("--- 全商品データ ---")
for row in c1.execute("SELECT * FROM product"):
    print(row)

# 条件に一致する商品を抽出
print("\n--- 在庫が30以下の商品 ---")
for row in c1.execute("SELECT * FROM product WHERE num <= 30"):
    print(row)

# 接続を閉じる
conn1.close()
print("-"*20)


# ② 主キーありテーブルの操作
# `Sample11_1.db` を使用して、主キー(PRIMARY KEY)を持つテーブルを操作する例です。

conn2 = sqlite3.connect("Sample11_1.db")
c2 = conn2.cursor()

# `id` を主キーとする `product2` テーブルを作成
c2.execute('''
CREATE TABLE IF NOT EXISTS product2 (id INTEGER PRIMARY KEY, name TEXT, price INTEGER)
''')

# データの挿入 (主キーが重複するとエラーになる)
try:
    c2.execute("INSERT INTO product2 VALUES(1, '鉛筆', 80)")
    c2.execute("INSERT INTO product2 VALUES(2, '消しゴム', 50)")
    conn2.commit()
    print("\n--- 主キー付きテーブルにデータを挿入しました ---")
except sqlite3.IntegrityError:
    print("\n--- データは既に挿入されています ---")

# 主キー付きテーブルの全データを表示
print("--- 主キー付きテーブルの全データ ---")
for row in c2.execute("SELECT * FROM product2"):
    print(row)

conn2.close()
print("-"*20)