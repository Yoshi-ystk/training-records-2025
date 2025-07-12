# ==============================================
# 文字列操作と正規表現の基本
# - Pythonの標準機能による文字列処理と正規表現の使い方を確認
# ==============================================
import re

# ==============================================
# ① 文字列の基本操作
# ==============================================
# 文字列のインデックスアクセス、スライス、長さの取得など、基本的な操作の例です。
str_sample = "Hello, Python!"
print(f"元の文字列: {str_sample}")
print(f"0番目の文字: {str_sample[0]}")
print(f"逆順の文字列: {str_sample[::-1]}")
print(f"文字列の長さ: {len(str_sample)}")
print("-"*20)


# ==============================================
# ② 大文字・小文字への変換
# ==============================================
# 文字列全体を大文字または小文字に変換します。
str_case = "AbCdEfG"
print(f"元の文字列: {str_case}")
print(f"大文字に変換: {str_case.upper()}")
print(f"小文字に変換: {str_case.lower()}")
print("-"*20)


# ==============================================
# ③ format()メソッドによる文字列フォーマット
# ==============================================
# format()メソッドを使って、文字列内に変数の値を埋め込みます。
word0, word1, word2 = "りんご", "バナナ", "みかん"
print("{0}と{1}と{2}".format(word0, word1, word2))

num0, num1 = 3, 1500
print("個数: {0:<5}個, 金額: {1:>10,}円".format(num0, num1))
print("-"*20)


# ==============================================
# ④ f文字列による小数点以下の桁数指定
# ==============================================
# f文字列を使って、数値の小数点以下の桁数を指定してフォーマットします。
s = 23.68725
print(f"面積は{s:.4f}㎡です。")
print("-"*20)


# ==============================================
# ⑤ 文字列の検索 (find)
# ==============================================
# find()メソッドで、文字列内に特定の文字列が含まれるか検索します。
str_find = "Python is a popular programming language."
key_find = "popular"
res_find = str_find.find(key_find)
if res_find != -1:
    print(f'「{str_find}」の {res_find} の位置に「{key_find}」が見つかりました。')
else:
    print(f'「{str_find}」の中に「{key_find}」は見つかりませんでした。')
print("-"*20)


# ==============================================
# ⑥ 文字列の置換 (replace)
# ==============================================
# replace()メソッドで、文字列内の一部を別の文字列に置換します。
str_replace = "I like Java."
old_str = "Java"
new_str = "Python"
str_new = str_replace.replace(old_str, new_str)
print(f'置換前: {str_replace}')
print(f'置換後: {str_new}')
print("-"*20)


# ==============================================
# ⑦ 正規表現による基本的なマッチング
# ==============================================
# compile()で正規表現パターンを作成し、search()で文字列とマッチングさせます。
patterns = ["Apple", "GoodBye", "Thankyou"]
strings_to_search = ["Hello", "GoodBye", "Thankyou"]
for p_str in patterns:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_to_search:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑧ 行頭(^)・行末($)を指定する正規表現
# ==============================================
# `^`は行頭、`$`は行末にマッチするアンカーです。
patterns_anchor = ["TXT", "^TXT", "TXT$", "^TXT$"]
strings_anchor = ["TXT", "TXTT", "TXTTT", "TTXT"]
for p_str in patterns_anchor:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_anchor:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑨ 任意の1文字(.)を指定する正規表現
# ==============================================
# `.` は改行を除く任意の1文字にマッチします。
patterns_dot = ["TXT.", "TXT..", ".TXT", "..TXT"]
strings_dot = ["TXT", "TXTT", "TXTTT", "TTXT"]
for p_str in patterns_dot:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_dot:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑩ 文字クラス([])を使った正規表現
# ==============================================
# `[]` で囲むと、その中のいずれか1文字にマッチします。
patterns_char_class = ["[012]", "[0-3]", "[^012]"]
strings_char_class = ["0", "1", "2", "3"]
for p_str in patterns_char_class:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_char_class:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑪ 繰り返し(*, +, ?, {})を使った正規表現
# ==============================================
# `*`: 0回以上, `+`: 1回以上, `?`: 0回または1回, `{n}`: n回の繰り返し
patterns_repeat = ["T*", "T+", "T?", "T{3}"]
strings_repeat = ["X", "T", "TT", "TTT", "TTTT"]
for p_str in patterns_repeat:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_repeat:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑫ グループ化(|)と選択肢を使った正規表現
# ==============================================
# `()` でグループ化し、`|` で複数の選択肢のいずれかにマッチさせます。
patterns_group = ["(TXT)+", "TXT|XTX"]
strings_group = ["TX", "TXT", "XTX", "TXTXT"]
for p_str in patterns_group:
    print(f"--- パターン: {p_str} ---")
    pattern = re.compile(p_str)
    for s_str in strings_group:
        res = pattern.search(s_str)
        match_result = "○" if res else "×"
        print(f"文字列: {s_str}, マッチ: {match_result}")
print("-"*20)


# ==============================================
# ⑬ 正規表現による置換 (sub)
# ==============================================
# sub()メソッドを使って、パターンにマッチした部分を置換します。
pattern_sub = re.compile(r"\.(csv|html|py)$")
files_sub = ["Sample.csv", "Sample.exe", "test.py", "index.html"]
print("--- 拡張子を.txtに置換 ---")
for f_name in files_sub:
    new_name = pattern_sub.sub(".txt", f_name)
    print(f"置換前: {f_name:<15} -> 置換後: {new_name}")
print("-"*20)


# ==============================================
# ⑭ 練習問題: 特定の拡張子のファイルをリストアップ
# ==============================================
# endswith()メソッドを使って、指定された拡張子を持つファイルを抽出します。
file_list = ["Sample.csv", "Sample.exe", "Sample1.py", "Sample2.py", "Sample.txt", "index.html"]
extension = ".py"
print(f"ファイルリスト: {file_list}")
print(f"拡張子「{extension}」で検索します。")

found_files = [f for f in file_list if f.endswith(extension)]

print("該当するファイル:")
for f in found_files:
    print(f)
print("-"*20)
