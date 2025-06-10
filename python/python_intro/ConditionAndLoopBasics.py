# Lesson: 条件分岐と繰り返しの基本
# if文, elif, else, for文, while文, break, continue などを用いた制御構文の基礎を学びます。

# if文を使う

sale = int(input("売上を入力してください。"))

if sale >= 100:
    print("売上は好調です。")

print("処理を終了します。")

# if ～ elif ～ else を使う

sale = int(input("売上を入力してください。"))

if sale >= 100:
    print("売上は好調です。")

elif sale >= 50:
    print("売上は普通です。")

else:
    print("売上は低調です。")

print("処理を終了します。")

# 論理演算子を使って条件を記述する

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

# for文とrangeを使って繰り返し処理を行う

for i in range(12):
    print(i + 1, "月のデータです。")

# while文を使う

i = 1

while i <= 12:
    print(i, "月のデータです。")
    # 条件がFalseに近づくように1増やしている
    i = i + 1
    # インデントされていないと無限ループする

# for文をネストする

# 外側のループを1回処理するたびに、内側のループは3回処理されている。
# 外側のループは全部で5回処理される。
for i in range(5):
    for j in range(3):
        print("iは", i, ":jは", j)

# if文などと組み合わせる

v = False

for i in range(5):
    for j in range(5):
        if v is False:
            # *を出力したら次は-を出力するようにvをTrueにする
            print("*", end="")
            v = True
        else:
            # -を出力したら次は*を出力するようにvをFalseにする
            print("-", end="")
            v = False
    # 内側のループが終わったら改行する
    print()

# print()では()内の「end="●"」で、指定した文字列を末尾に出力できる
# 「""」(空の文字列)を指定すると改行されない
# 「"\t"」(タブ)や「,"」(カンマ)などを指定すると出力結果が読みやすくなることがある

# break文でブロックから抜ける

num = int(input("何月の処理で終了しますか？(1～12)"))

# 本来は12回の繰り返しを行うfor文ですが
for i in range(12):
    print(i + 1, "月のデータです。")
    if (i + 1) == num:
        # 指定した月で繰り返しを終了する
        break

# continue文で処理を飛ばす

num = int(input("何月の処理を飛ばしますか？(1～12)"))

for i in range(12):
    if (i + 1) == num:
        # 入力した月の処理では、ここから先頭に戻る
        continue
    # 入力した月の処理では、この文は処理されない
    print(i + 1, "月のデータです。")

# 練習1：if文とfor文を使って1から10までの偶数を表示するコードを作成してください。
print("1から10までの偶数を表示します。")
for i in range(10):
    if (i + 1) % 2 == 0:
        print(i + 1)

# 練習2：for文だけを使って練習1と同様に出力するコードを作成してください。
# range(開始値,停止値,間隔)と指定することができる。
print("1から10までの偶数を表示します。")
for i in range(2, 11, 2):
    print(i)

# 練習3：九九の表をタブ区切りで表示する
# 練習3 タブ(\t)を使って九九の表を画面に出力するコードを作成いてください。
for i in range(1, 10):
    for j in range(1, 10):
        print(i * j, "\t", end="")
    print("\n")

# 練習4：ピラミッド型にアスタリスクを出力する
# 出力例：
# *
# **
# ***
# ****
# *****
# 練習4の出力処理
for i in range(1, 6):
    for j in range(i):
        print("*", end="")
    print()
