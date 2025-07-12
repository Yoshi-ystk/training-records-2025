 # ==============================================
 # WebページのHTML取得と<title>タグの抽出
 # - urllib.request でHTMLを取得
 # - HTMLParserを継承して<title>タグの中身を抽出
 # ==============================================

import urllib.request
from html.parser import HTMLParser

# ==============================================
# ① WebページからHTMLを取得
# ==============================================
# urllib.request を使って指定したURLのコンテンツ（HTML）を取得し、表示します。

url = "https://www.python.org/"
print(f"--- {url} のHTMLを取得します ---")

try:
    with urllib.request.urlopen(url) as response:
        html_content = response.read().decode('utf-8')
        print("HTMLの最初の500文字:")
        print(html_content[:500])
except Exception as e:
    print(f"エラーが発生しました: {e}")

print("-"*20)


# ==============================================
# ② タイトルタグを抽出（HTMLParser の継承）
# ==============================================
# HTMLParserを継承したカスタムクラスを作成し、HTMLのタイトルタグの内容を抽出します。

class TitleParser(HTMLParser):
    def __init__(self):
        super().__init__()
        self.in_title = False
        self.title_text = ""

    def handle_starttag(self, tag, attrs):
        if tag == 'title':
            self.in_title = True

    def handle_data(self, data):
        if self.in_title:
            self.title_text += data

    def handle_endtag(self, tag):
        if tag == 'title':
            self.in_title = False

print(f"--- {url} のタイトルを抽出します ---")

try:
    # 上で取得したHTMLコンテンツを再利用
    parser = TitleParser()
    parser.feed(html_content)
    print(f"ページのタイトル: {parser.title_text}")
except NameError:
    print("HTMLコンテンツが取得できていないため、解析をスキップします。")
except Exception as e:
    print(f"解析中にエラーが発生しました: {e}")

print("-"*20)