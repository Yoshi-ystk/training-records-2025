# ==============================================
# ① クラスの基本的な利用
# ==============================================
# 属性を外部から直接代入し、メソッドで取得する例
class Person_V1:
    def getName(self):
        return self.name

    def getAge(self):
        return self.age

pr = Person_V1()
# インスタンスに属性を直接代入
pr.name = "鈴木"
pr.age = 23

# メソッドで属性を取得
n = pr.getName()
a = pr.getAge()

# 出力して確認
print(f'{n}さんは{a}才です。')
print("-"*20)

# ==============================================
# ② 複数のインスタンス生成
# ==============================================
# 複数のオブジェクトを生成し、個別のデータを保持
class Person_V2:
    def getName(self):
        return self.name

    def getAge(self):
        return self.age

# 1人目のインスタンス生成と属性設定
pr1 = Person_V2()
pr1.name = "鈴木"
pr1.age = 23
n1 = pr1.getName()
a1 = pr1.getAge()

# 2人目のインスタンス生成と属性設定
pr2 = Person_V2()
pr2.name = "佐藤"
pr2.age = 38
n2 = pr2.getName()
a2 = pr2.getAge()

# 出力して確認
print(f'{n1}さんは{a1}才です。')
print(f'{n2}さんは{a2}才です。')
print("-"*20)

# ==============================================
# ③ コンストラクタの利用
# ==============================================
# __init__メソッドを使って初期化処理を実装
class Person_V3:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def getName(self):
        return self.name

    def getAge(self):
        return self.age

# インスタンス生成時に初期値を設定
pr = Person_V3("鈴木", 23)

n = pr.getName()
a = pr.getAge()

# 出力して確認
print(f'{n}さんは{a}才です。')
print("-"*20)

# ==============================================
# ④ クラス変数とクラスメソッド
# ==============================================
# インスタンス間で共有される値と、クラスから直接呼び出すメソッド
class Person_V4:
    count = 0  # クラス変数

    def __init__(self, name, age):
        Person_V4.count += 1
        self.name = name
        self.age = age

    def getName(self):
        return self.name

    def getAge(self):
        return self.age

    @classmethod
    def getCount(cls):
        return cls.count

# 複数インスタンス生成でカウントを増やす
pr1 = Person_V4("鈴木", 23)
pr2 = Person_V4("佐藤", 38)

# 出力して確認
print(f'{pr1.getName()}さんは{pr1.getAge()}才です。')
print(f'{pr2.getName()}さんは{pr2.getAge()}才です。')
print(f'合計人数は{Person_V4.getCount()}人です。')
print("-"*20)

# ==============================================
# ⑤ 継承とオーバーライド
# ==============================================
# 基底クラスの機能を引き継ぎつつ、メソッドを上書き（override）する
class Person:  # 基底クラス
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def getName(self):
        return self.name

    def getAge(self):
        return self.age

class Customer(Person):  # 派生クラス
    def __init__(self, nm, ag, ad, tl):
        super().__init__(nm, ag)
        self.adr = ad
        self.tel = tl

    def getName(self):  # メソッドのオーバーライド
        return "顧客：" + self.name

    def getAdr(self):
        return self.adr

    def getTel(self):
        return self.tel

# 派生クラスのインスタンス生成
pr = Customer("鈴木", 23, "mmm@nnn.nn.jp", "xxx-xxxx-xxxx")

nm = pr.getName()
ag = pr.getAge()
ad = pr.getAdr()
tl = pr.getTel()

# 出力して確認
print(f'{nm}さんは{ag}才です。')
print(f'アドレスは{ad}、電話番号は{tl}です。')
print("-"*20)