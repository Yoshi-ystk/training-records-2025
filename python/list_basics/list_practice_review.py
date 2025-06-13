# list_basics_review.py
# 📘 Python学習記録：リスト操作の基礎〜応用
# -----------------------------
# このファイルは、2025年6月のPython学習における
# 「リスト（list）」の基礎的な操作〜応用処理までを網羅した復習用記録です。
# 実際に手を動かして確認しながら理解を深めました。

# -----------------------------
# 🔹 リストの基本：作成と参照
# -----------------------------

sale = [80, 60, 22, 50, 75]
print("リスト全体:", sale)
print("リストの長さ:", len(sale))

print("各要素を1つずつ表示:")
for s in sale:
    print(s)

# -----------------------------
# 🔹 要素の変更・追加・削除
# -----------------------------

# 要素を変更
sale[2] = 100
print("3番目の要素を100に変更:", sale)

# 要素を追加
sale.append(120)
print("末尾に120を追加:", sale)

# 指定位置に挿入
sale.insert(1, 70)
print("2番目に70を挿入:", sale)

# 先頭の要素を削除
del sale[0]
print("先頭を削除:", sale)

# 値を指定して削除
if 50 in sale:
    sale.remove(50)
    print("値50を削除:", sale)

# -----------------------------
# 🔹 コピーと代入の違い
# -----------------------------

data1 = [1, 2, 3]
data2 = data1  # 同じ参照を持つ
data1[0] = 99
print("data1 (変更後):", data1)
print("data2 (参照が影響を受ける):", data2)

data1 = [1, 2, 3]
data2 = data1.copy()  # 独立したコピー
data1[0] = 88
print("data1 (再変更後):", data1)
print("data2 (影響なし):", data2)

# -----------------------------
# 🔹 スライス・連結・逆順処理
# -----------------------------

months = list(range(1, 13))
print("年間データ:", months)
print("前半6ヶ月:", months[:6])
print("後半6ヶ月:", months[6:])
print("2ヶ月ごと:", months[::2])
print("逆順:", months[::-1])

# reversed()は元データを変更しない
print("reversedを使った逆順:", list(reversed(months)))
# reverse()は元データを変更
months.reverse()
print("reverse()後の元データ:", months)

# -----------------------------
# 🔹 zip() と enumerate() の活用
# -----------------------------

cities = ["東京", "大阪", "福岡"]
sales = [100, 200, 150]

print("都市別の売上:")
for city, sale in zip(cities, sales):
    print(f"{city}: {sale}件")

print("都市のインデックスと値:")
for idx, city in enumerate(cities):
    print(f"{idx + 1}: {city}")

# -----------------------------
# 🔹 リスト内包表記の練習
# -----------------------------

nums = list(range(10))
even = [n for n in nums if n % 2 == 0]
squares = [n ** 2 for n in nums]
filtered = [n * 2 for n in nums if n != 3]

print("偶数リスト:", even)
print("2乗のリスト:", squares)
print("3以外を2倍:", filtered)

# -----------------------------
# 🔹 集計関数の活用
# -----------------------------

print("最大:", max(sales))
print("最小:", min(sales))
print("合計:", sum(sales))
print("昇順:", sorted(sales))
print("降順:", sorted(sales, reverse=True))

# -----------------------------
# 🔹 練習問題（スライス・内包表記）
# -----------------------------

fruits = ["apple", "banana", "cherry", "date", "fig", "grape"]
print("最初の3つ:", fruits[:3])
print("最後の2つ:", fruits[-2:])
print("2〜4番目:", fruits[1:4])

# 内包表記で80点以上のスコアを抽出
scores = [74, 85, 69, 77, 81]
over80 = [s for s in scores if s >= 80]
print("80点以上:", over80)
print("人数:", len(over80))

# -----------------------------
# 🔹 zip()で3つのリストを組み合わせる
# -----------------------------

city = ["東京", "名古屋", "大阪", "京都", "福岡"]
maxtemp = [32, 28, 27, 26, 27]
mintemp = [25, 21, 20, 19, 22]

print("都市別気温:")
for c, max_t, min_t in zip(city, maxtemp, mintemp):
    print(f"{c}：最高{max_t}℃／最低{min_t}℃")

# -----------------------------
# ✅ 学習メモ
# - listの参照・変更・操作方法はJavaと比較しても柔軟
# - zip()や内包表記を活用すると効率的な記述が可能
# - copy()による浅いコピーの挙動は理解必須