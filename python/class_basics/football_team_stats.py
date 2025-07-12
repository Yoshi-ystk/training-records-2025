# ==============================================
# サッカーチームの成績一覧と勝率ソート
# クラスの定義とリスト処理、ソート処理を通じてPythonのオブジェクト操作を学習
# ==============================================

# チーム名・勝敗・引き分け数を保持し、勝率を計算・表示するクラス
class Football_Team:
    def __init__(self, name, win, lose, draw):
        self.name = name
        self.win = win
        self.lose = lose
        self.draw = draw

    def calc_win_rate(self):
        total_matches = self.win + self.lose
        if total_matches == 0:
            return 0.0
        return int(self.win / total_matches * 100)

    def show_team_result(self):
        win_rate = self.calc_win_rate()
        print(f'{self.name:<14}|{self.win:>3} |{self.lose:>3} |  {self.draw:>3}   |  {win_rate:>3}%|')

# 各チームの成績データをインスタンスとして定義
teams = [
    Football_Team("Brazil", 73, 18, 18),
    Football_Team("Italy", 45, 21, 21),
    Football_Team("Argentina", 43, 15, 15),
    Football_Team("West Germany", 36, 14, 14),
    Football_Team("France", 34, 13, 13),
    Football_Team("Germany", 31, 6, 6),
    Football_Team("Spain", 30, 15, 15),
]

# 表ヘッダーの表示
print("┌", "-"*46, "┐")
print(f"|{'順位'.center(4)} |{'国名'.center(12)}| {'勝'.center(2)}| {'負'.center(2)}|{'引き分け'.center(3)}|{'勝率'.center(3)} |")
print("-"*49)

# 勝率（calc_win_rate）で降順ソート
teams.sort(key = lambda team: team.calc_win_rate(), reverse = True)

# 順位付きで各チームの成績を表示
for i, team in enumerate(teams, start = 1):
    print(f"|  {i:<5}|", end = "")
    team.show_team_result()

# 表の下線
print("└", "-"*46, "┘")
