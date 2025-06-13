# Lesson: 条件分岐と繰り返しの基本
# 本ファイルでは、Pythonの制御構文（if文、for文、while文、break、continue）を学び、
# 条件分岐や繰り返し処理の基礎を理解し、実践的なコードを書けるようになることを目的とします。

# --- if文の基本 ---

# if文を使う（売上が100以上の場合の判定）
sale = int(input("売上を入力してください。"))

if sale >= 100:
    print("売上は好調です。")

print("処理を終了します。")

# --- if ～ elif ～ else の使い方 ---

# 複数の条件分岐を使った売上判定
sale = int(input("売上を入力してください。"))

if sale >= 100:
    print("売上は好調です。")

elif sale >= 50:
    print("売上は普通です。")

else:
    print("売上は低調です。")

print("処理を終了します。")

# --- 論理演算子を使った複合条件 ---

# 売上と人数の両方の条件を組み合わせて判定する
sale = int(input("売上を入力してください。"))
num = int(input("人数を入力してください。"))

if sale >= 100 and num >= 30:
    print("売上は大盛況です。")

elif sale >= 100:
    print("売上は好調です。")

elif sale >= 50:
    print("売上は普通です。")

else:
    print("売上は低調です。")

print("処理を終了します。")

# --- for文による繰り返し処理 ---

# 1から12月までのデータを順に表示する
for i in range(12):
    print(i + 1, "月のデータです。")

# --- while文による繰り返し処理 ---

# 1から12月までのデータを順に表示する（while文使用）
i = 1

while i <= 12:
    print(i, "月のデータです。")
    # 条件がFalseに近づくように1ずつ増やす
    i = i + 1
    # インデントがずれると無限ループになるため注意

# --- ネストしたfor文の例 ---

# 外側のループ1回につき内側のループ3回実行される例
for i in range(5):
    for j in range(3):
        print("iは", i, ":jは", j)

# --- if文と組み合わせた繰り返し処理 ---

# 交互に「*」と「-」を出力する例
v = False

for i in range(5):
    for j in range(5):
        if v is False:
            # 「*」を出力したら次は「-」を出力するように切り替える
            print("*", end="")
            v = True
        else:
            # 「-」を出力したら次は「*」を出力するように切り替える
            print("-", end="")
            v = False
    # 内側のループ終了後に改行する
    print()

# print()のend引数についての補足説明
# end="●"で指定した文字列を末尾に出力できる
# end=""（空文字）を指定すると改行されない
# end="\t"（タブ）やend=","（カンマ）などを指定すると出力結果が読みやすくなる場合がある

# --- break文でループを途中終了する ---

num = int(input("何月の処理で終了しますか？(1～12)"))

# 12回の繰り返しを行うfor文だが、指定月で終了する
for i in range(12):
    print(i + 1, "月のデータです。")
    if (i + 1) == num:
        # 指定した月で繰り返しを終了する
        break

# --- continue文で処理をスキップする ---

num = int(input("何月の処理を飛ばしますか？(1～12)"))

for i in range(12):
    if (i + 1) == num:
        # 入力した月の処理ではここからループの先頭に戻る（スキップ）
        continue
    # 入力した月の処理ではこの文は実行されない
    print(i + 1, "月のデータです。")

# --- 練習問題 ---

# 練習1：if文とfor文を使って1から10までの偶数を表示するコード
print("1から10までの偶数を表示します。")
for i in range(10):
    if (i + 1) % 2 == 0:
        print(i + 1)

# 練習2：for文だけを使って練習1と同様に偶数を表示するコード
# range(開始値, 停止値, 間隔)を利用する
print("1から10までの偶数を表示します。")
for i in range(2, 11, 2):
    print(i)

# 練習3：九九の表をタブ区切りで表示するコード
for i in range(1, 10):
    for j in range(1, 10):
        print(i * j, "\t", end="")
    print("\n")

# 練習4：ピラミッド型にアスタリスクを出力するコード
# 出力例：
# *
# **
# ***
# ****
# *****
for i in range(1, 6):
    for j in range(i):
        print("*", end="")
    print()
