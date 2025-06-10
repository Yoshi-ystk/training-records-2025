' Excel VBA 基礎学習（体験形式）で作成したマクロのまとめ
' 職業訓練校での授業内容に基づいています。
' 本格的な開発ではなく、基本操作の理解を目的としています。
' ※ 本ファイルは整理済みで、主な構文や機能のサンプルを掲載しています。
Attribute VB_Name = "Module1"

'------------------------------
' 第1章：シート操作の基本
'------------------------------
Sub 練習1()
    Worksheets.Add Before:=Worksheets("東京支店"), _
    Count:=2
End Sub

Sub シート指定1()
    Worksheets("Sheet2").Range("A1").Value = 123
End Sub

Sub 変数練習1()
    Dim 文字列 As String
    文字列 = Range("A1").Value
    Range("B3").Value = 文字列
    ActiveSheet.Name = 文字列
    MsgBox 文字列 & "です"
End Sub

Sub 変数練習2()
    Dim シート As Worksheet
    Set シート = Worksheets(2)
    シート.Select
    Range("A1").Value = シート.Name
    Set シート = Nothing
End Sub

'------------------------------
' 第4章：セルの参照と操作
'------------------------------

Sub セルの参照()
    Range("A1").Value = "こんにちは"
    Range("B3:C3").Value = "おはよう"
End Sub

Sub 隣接するセルの参照()
    Range("A1").Offset(1, 1).Value = "右下"
    Range("B3:C3").Offset(2, -1).Value = "１つ左２つ下"
End Sub

Sub アクティブセルの参照()
    ActiveCell.ClearContents
End Sub

Sub 表の最終行の次の行を選択()
    Range("A3").End(xlDown).Offset(1).Select
End Sub

Sub 表の最終行の次の行を選択2()
    Cells(Rows.Count, 1).End(xlUp).Offset(1).Select
End Sub

Sub 文字や数値の削除()
    Range("A4:E8").SpecialCells(xlCellTypeConstants, _
    xlNumbers + xlTextValues).ClearContents
End Sub

Sub データ入力()
    Range("A1").Value = Range("B8") & "ランチ"
End Sub

Sub 表の削除()
    Range("A3:B6").Clear
End Sub

Sub 表のコピー()
    Range("A3").CurrentRegion.Copy Range("D3")
End Sub

Sub 表を複数コピー()
    Range("A3").CurrentRegion.Copy
    ActiveSheet.Paste Range("D3")
    ActiveSheet.Paste Range("G3")
    Application.CutCopyMode = False
End Sub

Sub 表の移動()
    Range("A3").CurrentRegion.Cut Range("D3")
End Sub

Sub 書式のみコピー()
    Range("A3").CurrentRegion.Copy
    Range("D3").PasteSpecial xlPasteFormats
    Application.CutCopyMode = False
End Sub

Sub 列の選択()
    Columns("B:C").Select
End Sub

Sub 列を削除()
    Columns("D:E").Delete
End Sub

Sub 行を挿入()
    Rows("4:5").Insert CopyOrigin:=xlFormatFromRightOrBelow
End Sub

Sub 選択セルの行を選択()
    Selection.EntireRow.Select
End Sub

'------------------------------
' 第5章：セルの書式設定
'------------------------------

Sub 文字書式の変更()
    With Range("A3", Range("A3").End(xlToRight)).Font
        .Name = "MP Pゴシック"
        .Size = 13
        .Bold = True
    End With
End Sub

Sub 文字の色やセルの色を変更()
    With Range("A3", Range("A3").End(xlToRight))
        .Font.Color = RGB(0, 0, 255)
        .Interior.Color = RGB(146, 208, 80)
    End With
End Sub

Sub テーマの色を変更()
    With Range("A3", Range("A3").End(xlToRight))
        With .Font
            .ThemeColor = xlThemeColorLight2
        End With
        With .Interior
            .ThemeColor = xlThemeColorAccent4
            .TintAndShade = 0.4
        End With
    End With
End Sub

Sub 行の高さの変更()
    Rows("4:8").RowHeight = 25
End Sub

Sub 列幅の調整()
    Columns("A:B").ColumnWidth = 20
End Sub

Sub 列幅の自動調整()
    Range("A3", Range("A3").End(xlToRight)) _
    .EntireColumn.AutoFit
End Sub

Sub セル範囲を基準に調整()
    Range("A3").CurrentRegion.Columns.AutoFit
End Sub

Sub データ抽出()
    Range("A3").AutoFilter Field:=4, Criteria1:="秋葉原"
End Sub

Sub 複数条件を指定してデータを抽出()
    Range("A3").AutoFilter Field:=4, Criteria1:="渋谷"
    Range("A3").AutoFilter Field:=5, Criteria1:="<=2016/12/31"
End Sub

Sub 抽出範囲を指定()
    Range("A3").AutoFilter Field:=5, Criteria1:="<=2016/12/31", _
    Operator:=xlAnd, Criteria2:=">=2016/1/1"
End Sub

Sub オートフィルター解除()
    If ActiveSheet.AutoFilterMode = True Then
        Range("A3").AutoFilter
    End If
End Sub

Sub すべてのデータを表示()
    If ActiveSheet.FilterMode = True Then
        ActiveSheet.ShowAllData
    End If
End Sub

Sub テーブルに変換()
    With ActiveSheet.ListObjects.Add(SourceType:=xlSrcRange, _
        Source:=Range("A3").CurrentRegion)
        .TableStyle = "tablestylemedium3"
        .Name = "売上明細"
    End With
End Sub

Sub テーブルのデータの抽出()
    With ActiveSheet.ListObjects("売上明細")
        .Range.AutoFilter Field:=3, Criteria1:="キャップ"
        .ShowTotals = True
        .ListColumns("数量").TotalsCalculation = _
        xlTotalsCalculationSum
    End With
End Sub

Sub データの並び替え_複数条件の指定()
    With ActiveSheet.Sort
        .SortFields.Clear
        .SortFields.Add Key:=Range("E3"), _
        SortOn:=xlSortOnValues, Order:=xlAscending
        .SortFields.Add Key:=Range("D3"), _
        SortOn:=xlSortOnValues, Order:=xlDescending
        .SetRange Range("A3").CurrentRegion
        .Header = xlYes
        .Apply
    End With
End Sub

Sub データの並び替え2()
    Range("A3").Sort _
    Key1:=Range("E3"), Order1:=xlAscending, _
    Key2:=Range("D3"), order2:=xlDescending, _
    Header:=xlYes
End Sub

'------------------------------
' 第6章：シートとブックの操作
'------------------------------

Sub シート選択()
    Worksheets("福岡").Select
End Sub

Sub シート名の変更()
    Worksheets(1).Name = "集計表"
End Sub

Sub シートの見出しの色の変更()
    Worksheets("集計表").Tab.ColorIndex = 39
End Sub

Sub シートの追加()
    Worksheets.Add Before:=Worksheets(1)
    Worksheets(1).Name = "一覧"
End Sub

Sub シートを削除()
    Worksheets(Worksheets.Count).Delete
End Sub

Sub ブックを選択()
    Workbooks("グッズリスト.xlsm").Activate
End Sub

Sub 保存先やブック名の取得()
    With ActiveWorkbook
        MsgBox .Name & vbCrLf & _
        .Path & vbCrLf & _
        .FullName
    End With
End Sub

Sub このマクロを含むブック名の取得()
    MsgBox ThisWorkbook.Name
End Sub

Sub Test()
    Dim str(3) As String
    str(0) = "A"
    str(1) = "B"
    str(2) = "C"
    str(3) = "D"
    'str(4) = "E"
    Dim i As Integer
    For i = 0 To 3
        Debug.Print str(i)
    Next i
End Sub

Sub カレントフォルダーの場所を取得()
    'Eドライブのカレントフォルダーを表示,CurDirはカレントドライブの操作
    MsgBox CurDir("E")
End Sub

Sub ブックを開く()
    Workbooks.Open _
    Filename:=ThisWorkbook.Path & "\グッズリスト.xlsm"
End Sub

Sub パスワードありのブックを開く()
    Workbooks.Open _
    Filename:=ThisWorkbook.Path & "\グッズリスト.xlsm", _
    Password:="cs1115"
End Sub

Sub 新しいブックを追加()
    Workbooks.Add
End Sub

Sub ブックを閉じる()
    Workbooks("グッズリスト.xlsm").Close
End Sub

Sub ブックを保存してから閉じる()
    Workbooks("グッズリスト.xlsm").Close _
    SaveChanges:=True // True:変更を保存、False:変更せず保存
End Sub

Sub ブックの保存()
    Workbooks.Add
    ActiveSheet.Name = "おはよう"
    ActiveWorkbook.SaveAs _
    Filename:="マクロの練習.xlsx"
    ' Filename:="E \Study\ExcelVBA\マクロの練習.xlsx"
    ' E～VBA\までをstr1等に代入して使用することも可
End Sub

Sub 上書き保存()
    ActiveWorkbook.Save
End Sub

Sub 印刷の設定()
    With Worksheets(1).PageSetup
        ' 用紙の向きを横にする
        .Orientation = xlLandscape
        ' 拡大･縮小の指定はオフ
        .Zoom = False

        ' 縦1ページ内に収める
        ' 横1ページ内に収める
        .FitToPagesTall = 1
        .FitToPagesWide = 1

        ' ヘッダーの右にファイル名とシート名を表示する
        .RightHeader = "ファイル名：&F(シート名：&A)"

        ' 左のヘッダーに日付を表示
        .LeftHeader = "&D"
        ' 中央のフッターに「(ページ番号)/(総ページ数)」を表示する
        .CenterFooter = "&P/&N"
    End With
    Worksheets(1).PrintPreview
End Sub

Sub 印刷イメージ表示()
    Worksheets(1).PrintPreview
End Sub

Sub 印刷の実行()
    'Worksheets(1).PrintOut copies:=2
End Sub

'------------------------------
' 第7章：条件分岐・繰り返し処理・メッセージ
'------------------------------

Sub 条件を判断して処理を分岐()
    ' E1セルが空欄の場合はメッセージを表示
    If Range("E1").Value = "" Then
        MsgBox "担当者を入力してください"
        ' それ以外の場合はアクティブシートを新しいブックにコピー
    Else
        ActiveSheet.Copy
    End If
End Sub

Sub 条件を判断して処理を分岐2()
    If Range("B4").Value = "" Then
        MsgBox "担当者を入力してください"
    Elseif Range("E7").Value >= 7000000 Then
        ActiveSheet.Tab.Color = RGB(0, 153, 255)
    Elseif Range("E7").Value >= 6000000 Then
        ActiveSheet.Tab.Color = RGB(0, 204, 255)
    Else
        ActiveSheet.Tab.ColorIndex = xColorIndexNone
    End If
End Sub

Sub 条件を判断して処理を分岐3()
    Select Case Range("E7").Value
     Case Is >= 8000000
        ActiveSheet.Tab.Color = RGB(0, 51, 153)
     Case Is >= 7000000
        ActiveSheet.Tab.Color = RGB(0, 153, 255)
     Case Is >= 6000000
        ActiveSheet.Tab.Color = RGB(102, 204, 255)
     Case Else
        ActiveSheet.Tab.ColorIndex = xlColorIndexNone
    End Select

End Sub

Sub 繰り返し()
    Dim 数 As Integer
    For 数 = 5 To 10 Step 2
        Range(Cells(数, 1), Cells(数, 4)). _
        Font.ColorIndex = 46
        Next
End Sub

Sub 文字の色を1行おきに設定1()
    Range("A5").Select
    Do Until ActiveCell.Value = ""
        ActiveCell.Resize(, 4).Font.ColorIndex = 46
        ActiveCell.Offset(2).Select
    Loop
End Sub

Sub 全シートに対して処理を実行()
    Dim 全シート As Worksheets
    For Each 全シート In Worksheets
        全シート .Tab.ColorIndex = xlColorIndexNone
        Next
End Sub

Sub 空白セルの行削除()
    On Error Goto エラーメッセージ
        Range("C4:C8").SpecialCells _
        (xlCellTypeBlanks).EntireRow.Delete
     Exit Sub

        エラーメッセージ:
        MsgBox Err.Description
End Sub

Sub シートの検索()
    Dim 探すシート As String
    Dim 全シート As Worksheet
    探すシート = Range("B1").Value
    For Each 全シート In Worksheets
        If 全シート.Name = 探すシート Then
            Worksheets(探すシート).Select
        End If
        Next
        MsgBox 探すシート & "シートはありません"
End Sub

Sub ブックの検索()
    Dim 探すブック As String
    Dim ブック As Workbook
    探すブック = Range("B2").Value
    For Each 全ブック In Workbooks
        If 全ブック.Name = 探すブック Then
            Workbooks(探すブック).Activate
         Exit Sub
        End If
        Next
        MsgBox 探すブック & "ブックは開いていません"
End Sub

Sub フォルダー内のブックに対して同じ処理を実行()
    Dim フォルダー名 As String
    Dim ブック名 As String
    フォルダー名 = ThisWorkbook.Path & "\"
    ブック名 = Dir(フォルダー名 & "*.xlsx")
    Do While ブック名 <> ""
        MsgBox ブック名
        ブック名 = Dir()
    Loop
End Sub

Sub データ転記()
    Dim 全シート As Worksheets
    For Each 全シート In Worksheets
        With 全シート
            If .Name <> "一覧" Then
                .Range(.Cells(4, 1), Cells(Rows.Count, 1) _
                .End(xlUp).Offset(, 4)).Copy Worksheets("一覧") _
                .Cells(Rows.Count, 1).End(xlUp).Offset(1)
            End If
        End With
        Next
End Sub

Sub シート名の入力()
    Dim シート名 As String
    シート名 = InputBox("シート名を入力してください", _
    "シート名の入力")
    If シート名 <> "" Then
        ActiveSheet.Name = シート名
    End If
End Sub

Sub メッセージの表示()
    MsgBox "今日は、" & vbCrLf & "良い天気です", _
    vbInformation, "天気    "
End Sub

Sub データ転記2()
    Dim 答え As Integer
    Dim 全シート As Worksheet
    答え = MsgBox("データをまとめる処理を実行しますか？", _
    vbYesNo + vbQuestion + vbDefaultButton2, "実行確認")
    If 答え = vbYes Then
        For Each 全シート In Worksheets
            With 全シート
                If .Name <> "一覧" Then
                    .Range(.Cells(4, 1), .Cells(Rows.Count, 1) _
                    .End(xlUp).Offset(, 4)).Copy Worksheets("一覧") _
                    .Cells(Rows.Count, 1).End(xlUp).Offset(1)
                End If
            End With
            Next
        Else
            MsgBox "操作をキャンセルしました"
        End If
End Sub

Sub フォルダーの作成()
    MkDir ThisWorkbook.Path & "\練習"
End Sub

Sub ファイルを開く画面を表示()
    With Application.FileDialog(msoFileDialogOpen)
        .InitialFileName = ThisWorkbook.Path & "\"
        .FilterIndex = 2
        If .Show = -1 Then .Execute
        End With
End Sub

Sub ファイルを保存する画面()
    With Application.FileDialog(msoFileDialogSaveAs)
        .InitialFileName = ThisWorkbook.Path & "\"
        .FilterIndex = 1
        If .Show = -1 Then .Execute
        End With
End Sub

Sub 行の見出しの設定()
    With Worksheets("売上").PageSetup
        .PrintTitleRows = "$1:$3"
        .PrintTitleColumns = ""
    End With
End Sub


Sub 練習1()
    Dim i As Integer
    For i = 2 To 11
        If Cells(i, 3).Value <> 0 Then
            Cells(i, 4).Value = Int(Cells(i, 2).Value / Cells(i, 3).Value)
        Else
            Cells(i, 4).Value = "エラー"
        End If
    Next i
End Sub

Sub 練習2()
    Dim i As Integer
    Dim lastrow As Integer

    lastrow = Cells(Rows.Count, 1).End(xlUp).Row

    For i = 2 To lastrow
        If Cells(i, 3).Value <> 0 Then
            Cells(i, 4).Value = Int(Cells(i, 2).Value * Cells(i, 3).Value)
        Else
            Cells(i, 4).Value = "エラー"
        End If
    Next i
End Sub


Sub 練習3()
    Dim i As Integer
    Dim j As Integer
    Dim xValue As Variant
    Dim yValue As Variant


    For i = 2 To 11
        yValue = Cells(i, 1).Value
        For j = 2 To 11
            xValue = Cells(1, j).Value

            If IsNumeric(xValue) And IsNumeric(yValue) Then
                Cells(i, j).Value = xValue * yValue
            End If
        Next j
    Next i
End Sub