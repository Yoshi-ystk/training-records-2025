# ==============================================
# 関数の基礎
# ==============================================

# ① 引数なしの関数
def sell():
    print("販売が行われました。")

sell()

# ② 関数の再利用
print("もう1度販売を行います。")
sell()

# ③ 引数を持つ関数
def sell(place):
    print(f'{place}支店の販売が行われました。')

sell("東京")
sell("大阪")

# ④ 変数を引数に渡す
shop = "東京"
sell(shop)

# ⑤ 複数の引数を持つ関数
def sell(place, num):
    print(f'{place}支店で{num}万円の販売が行われました。')

sell("東京", 5)

# ==============================================
# 戻り値と計算
# ==============================================

# ⑥ 戻り値を持つ関数
def sell(place, price, num):
    print(f'{place}支店で{num}社に{price}万円の販売が行われました。')
    return price * num

total = sell("東京", 100, 5)
print(f'売り上げは{total}万円でした。')

# ⑦ 複数の戻り値
def sell_date():
    y, m, d = 2018, 10, 1
    print(f'{y}年{m}月{d}日に販売が行われました。')
    return y, m, d

sy, sm, sd = sell_date()
print("販売完了:", sy, sm, sd)

# ==============================================
# デフォルト引数の練習問題
# ==============================================

def greet(name="great"):
    print("Hello", name, "さん")

greet("TARO")  # Hello TARO さん
greet()        # Hello great さん

# 割引計算
def discount(price, d=10):
    return price * (1 - d / 100)

print(int(discount(1000, 20)))  # 800
print(int(discount(1000)))      # 900

# ==============================================
# 関数をデータとして扱う
# ==============================================

def append():
    print("データを追加します。")
def update():
    print("データを変更します。")
def delete():
    print("データを削除します。")

actions = [append, update, delete]
res = int(input("操作番号を入力してください。(0～2): "))
if 0 <= res < len(actions):
    actions[res]()

# ==============================================
# ラムダ式の活用
# ==============================================

data = [1, 2, 3, 4, 5]
for d in map(lambda x: x * 2, data):
    print(d)

# ==============================================
# デコレータの活用
# ==============================================

def deco(func):
    def wrapper(x):
        wx = "---" + x + "---"
        return func(wx)
    return wrapper

@deco
def printmsg(x):
    print(x, "を入力しました。")

msg = input("メッセージを入力してください: ")
printmsg(msg)

# ==============================================
# スコープと変数の寿命
# ==============================================

a = 0  # グローバル変数

def funcB():
    b = 1
    print("funcB:", a, b)

def funcC():
    c = 2
    print("funcC:", a, c)

print("外部:", a)
funcB()
funcC()

# グローバルとローカル変数の違い
a = 0

def func():
    global a
    b = 0
    print("a =", a, "b =", b)
    a += 1
    b += 1

for _ in range(5):
    func()

# ==============================================
# スコープに関する練習問題
# ==============================================

def scope_test():
    spam = "test spam"

    def do_local():
        spam = "local spam"

    def do_nonlocal():
        nonlocal spam
        spam = "nonlocal spam"

    def do_global():
        global spam
        spam = "global spam"

    do_local()
    print("①:", spam)

    do_nonlocal()
    print("②:", spam)

    do_global()
    print("③:", spam)

scope_test()
print("④:", spam)