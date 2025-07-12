# ==============================================
# ファイル入出力、例外処理、OS操作、日時取得の基本
# - 標準ライブラリを活用したファイル操作と安全な処理の実践
# ==============================================

import csv
import json
import os
import os.path
import datetime

# ==============================================
# ① テキストファイルの書き込みと読み込み
# - with構文による安全なファイル操作
# ==============================================
file_path_txt = "Sample.txt"

# 書き込み
print(f"--- {file_path_txt} への書き込み ---")
with open(file_path_txt, "w", encoding="utf-8") as f:
    f.write("こんにちは\n")
    f.write("さようなら\n")
print("書き込み完了。")

# 読み込み
print(f"\n--- {file_path_txt} の読み込み ---")
with open(file_path_txt, "r", encoding="utf-8") as f:
    for line in f:
        print(line, end="")
print("-"*20)


# ==============================================
# ② CSVファイルの読み込み
# - csv.readerを使ってCSVを1行ずつ取得
# ==============================================
file_path_csv = "Sample.csv"
print(f"--- {file_path_csv} の読み込み ---")
with open(file_path_csv, "r", encoding="utf-8") as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
print("-"*20)


# ==============================================
# ③ JSONファイルの読み込み
# - json.loadで辞書型に変換して扱う
# ==============================================
file_path_json = "Sample.json"
print(f"--- {file_path_json} の読み込み ---")
with open(file_path_json, "r", encoding="shift_jis") as f:
    data = json.load(f)
    print(data)
print("-"*20)


# ==============================================
# ④ 例外処理 (try-except-else-finally)
# - ファイルが存在しない場合のエラーを捕捉
# ==============================================
print("--- 例外処理のテスト ---")
try:
    with open("non_existent_file.txt", "r") as f:
        print("ファイルを開きました。")
except FileNotFoundError:
    print("エラー: ファイルが見つかりませんでした。")
else:
    print("ファイル処理が正常に完了しました。")
finally:
    print("処理を終了します。")
print("-"*20)


# ==============================================
# ⑤ osモジュールによるディレクトリ情報の取得
# - カレントディレクトリ内のファイルとフォルダを判別
# ==============================================
print("--- カレントディレクトリの情報 ---")
for name in os.listdir("."):
    # フルパスを取得
    full_path = os.path.abspath(name)
    # ファイルかディレクトリかを判定
    if os.path.isfile(name):
        print(f"[ファイル] {name}")
    elif os.path.isdir(name):
        print(f"[ディレクトリ] {name}")
print("-"*20)


# ==============================================
# ⑥ os.pathモジュールによるファイル情報の取得
# - 各ファイルのサイズをバイト単位で取得
# ==============================================
print("--- ファイルサイズの取得 ---")
print(f"{'名前':<30} | {'サイズ(バイト)'}")
print("-"*45)
for name in os.listdir("."):
    if os.path.isfile(name):
        size = os.path.getsize(name)
        print(f"{name:<30} | {size}")
print("-"*20)


# ==============================================
# ⑦ datetimeモジュールによる日時の扱い
# - 現在の日時取得とフォーマット指定出力
# ==============================================
print("--- 日時情報の取得とフォーマット ---")
now = datetime.datetime.now()
print(f"現在の日時: {now}")
print(f"年: {now.year}, 月: {now.month}, 日: {now.day}")

# 1日後の日時を計算
tomorrow = now + datetime.timedelta(days=1)
print(f"1日後の日時: {tomorrow}")

# 日時を指定の書式にフォーマット
formatted_time = now.strftime("%Y年%m月%d日 %H:%M:%S")
print(f"フォーマットされた日時: {formatted_time}")
print("-"*20)
