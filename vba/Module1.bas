' Excel VBA ��b�w�K�i�̌��`���j�ō쐬�����}�N���̂܂Ƃ�
' �E�ƌP���Z�ł̎��Ɠ��e�Ɋ�Â��Ă��܂��B
' �{�i�I�ȊJ���ł͂Ȃ��A��{����̗�����ړI�Ƃ��Ă��܂��B
' �� �{�t�@�C���͐����ς݂ŁA��ȍ\����@�\�̃T���v�����f�ڂ��Ă��܂��B
Attribute VB_Name = "Module1"

'------------------------------
' ��1�́F�V�[�g����̊�{
'------------------------------
Sub ���K1()
    Worksheets.Add Before:=Worksheets("�����x�X"), _
    Count:=2
End Sub

Sub �V�[�g�w��1()
    Worksheets("Sheet2").Range("A1").Value = 123
End Sub

Sub �ϐ����K1()
    Dim ������ As String
    ������ = Range("A1").Value
    Range("B3").Value = ������
    ActiveSheet.Name = ������
    MsgBox ������ & "�ł�"
End Sub

Sub �ϐ����K2()
    Dim �V�[�g As Worksheet
    Set �V�[�g = Worksheets(2)
    �V�[�g.Select
    Range("A1").Value = �V�[�g.Name
    Set �V�[�g = Nothing
End Sub

'------------------------------
' ��4�́F�Z���̎Q�ƂƑ���
'------------------------------

Sub �Z���̎Q��()
    Range("A1").Value = "����ɂ���"
    Range("B3:C3").Value = "���͂悤"
End Sub

Sub �אڂ���Z���̎Q��()
    Range("A1").Offset(1, 1).Value = "�E��"
    Range("B3:C3").Offset(2, -1).Value = "�P���Q��"
End Sub

Sub �A�N�e�B�u�Z���̎Q��()
    ActiveCell.ClearContents
End Sub

Sub �\�̍ŏI�s�̎��̍s��I��()
    Range("A3").End(xlDown).Offset(1).Select
End Sub

Sub �\�̍ŏI�s�̎��̍s��I��2()
    Cells(Rows.Count, 1).End(xlUp).Offset(1).Select
End Sub

Sub �����␔�l�̍폜()
    Range("A4:E8").SpecialCells(xlCellTypeConstants, _
    xlNumbers + xlTextValues).ClearContents
End Sub

Sub �f�[�^����()
    Range("A1").Value = Range("B8") & "�����`"
End Sub

Sub �\�̍폜()
    Range("A3:B6").Clear
End Sub

Sub �\�̃R�s�[()
    Range("A3").CurrentRegion.Copy Range("D3")
End Sub

Sub �\�𕡐��R�s�[()
    Range("A3").CurrentRegion.Copy
    ActiveSheet.Paste Range("D3")
    ActiveSheet.Paste Range("G3")
    Application.CutCopyMode = False
End Sub

Sub �\�̈ړ�()
    Range("A3").CurrentRegion.Cut Range("D3")
End Sub

Sub �����̂݃R�s�[()
    Range("A3").CurrentRegion.Copy
    Range("D3").PasteSpecial xlPasteFormats
    Application.CutCopyMode = False
End Sub

Sub ��̑I��()
    Columns("B:C").Select
End Sub

Sub ����폜()
    Columns("D:E").Delete
End Sub

Sub �s��}��()
    Rows("4:5").Insert CopyOrigin:=xlFormatFromRightOrBelow
End Sub

Sub �I���Z���̍s��I��()
    Selection.EntireRow.Select
End Sub

'------------------------------
' ��5�́F�Z���̏����ݒ�
'------------------------------

Sub ���������̕ύX()
    With Range("A3", Range("A3").End(xlToRight)).Font
        .Name = "MP P�S�V�b�N"
        .Size = 13
        .Bold = True
    End With
End Sub

Sub �����̐F��Z���̐F��ύX()
    With Range("A3", Range("A3").End(xlToRight))
        .Font.Color = RGB(0, 0, 255)
        .Interior.Color = RGB(146, 208, 80)
    End With
End Sub

Sub �e�[�}�̐F��ύX()
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

Sub �s�̍����̕ύX()
    Rows("4:8").RowHeight = 25
End Sub

Sub �񕝂̒���()
    Columns("A:B").ColumnWidth = 20
End Sub

Sub �񕝂̎�������()
    Range("A3", Range("A3").End(xlToRight)) _
    .EntireColumn.AutoFit
End Sub

Sub �Z���͈͂���ɒ���()
    Range("A3").CurrentRegion.Columns.AutoFit
End Sub

Sub �f�[�^���o()
    Range("A3").AutoFilter Field:=4, Criteria1:="�H�t��"
End Sub

Sub �����������w�肵�ăf�[�^�𒊏o()
    Range("A3").AutoFilter Field:=4, Criteria1:="�a�J"
    Range("A3").AutoFilter Field:=5, Criteria1:="<=2016/12/31"
End Sub

Sub ���o�͈͂��w��()
    Range("A3").AutoFilter Field:=5, Criteria1:="<=2016/12/31", _
    Operator:=xlAnd, Criteria2:=">=2016/1/1"
End Sub

Sub �I�[�g�t�B���^�[����()
    If ActiveSheet.AutoFilterMode = True Then
        Range("A3").AutoFilter
    End If
End Sub

Sub ���ׂẴf�[�^��\��()
    If ActiveSheet.FilterMode = True Then
        ActiveSheet.ShowAllData
    End If
End Sub

Sub �e�[�u���ɕϊ�()
    With ActiveSheet.ListObjects.Add(SourceType:=xlSrcRange, _
        Source:=Range("A3").CurrentRegion)
        .TableStyle = "tablestylemedium3"
        .Name = "���㖾��"
    End With
End Sub

Sub �e�[�u���̃f�[�^�̒��o()
    With ActiveSheet.ListObjects("���㖾��")
        .Range.AutoFilter Field:=3, Criteria1:="�L���b�v"
        .ShowTotals = True
        .ListColumns("����").TotalsCalculation = _
        xlTotalsCalculationSum
    End With
End Sub

Sub �f�[�^�̕��ёւ�_���������̎w��()
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

Sub �f�[�^�̕��ёւ�2()
    Range("A3").Sort _
    Key1:=Range("E3"), Order1:=xlAscending, _
    Key2:=Range("D3"), order2:=xlDescending, _
    Header:=xlYes
End Sub

'------------------------------
' ��6�́F�V�[�g�ƃu�b�N�̑���
'------------------------------

Sub �V�[�g�I��()
    Worksheets("����").Select
End Sub

Sub �V�[�g���̕ύX()
    Worksheets(1).Name = "�W�v�\"
End Sub

Sub �V�[�g�̌��o���̐F�̕ύX()
    Worksheets("�W�v�\").Tab.ColorIndex = 39
End Sub

Sub �V�[�g�̒ǉ�()
    Worksheets.Add Before:=Worksheets(1)
    Worksheets(1).Name = "�ꗗ"
End Sub

Sub �V�[�g���폜()
    Worksheets(Worksheets.Count).Delete
End Sub

Sub �u�b�N��I��()
    Workbooks("�O�b�Y���X�g.xlsm").Activate
End Sub

Sub �ۑ����u�b�N���̎擾()
    With ActiveWorkbook
        MsgBox .Name & vbCrLf & _
        .Path & vbCrLf & _
        .FullName
    End With
End Sub

Sub ���̃}�N�����܂ރu�b�N���̎擾()
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

Sub �J�����g�t�H���_�[�̏ꏊ���擾()
    'E�h���C�u�̃J�����g�t�H���_�[��\��,CurDir�̓J�����g�h���C�u�̑���
    MsgBox CurDir("E")
End Sub

Sub �u�b�N���J��()
    Workbooks.Open _
    Filename:=ThisWorkbook.Path & "\�O�b�Y���X�g.xlsm"
End Sub

Sub �p�X���[�h����̃u�b�N���J��()
    Workbooks.Open _
    Filename:=ThisWorkbook.Path & "\�O�b�Y���X�g.xlsm", _
    Password:="cs1115"
End Sub

Sub �V�����u�b�N��ǉ�()
    Workbooks.Add
End Sub

Sub �u�b�N�����()
    Workbooks("�O�b�Y���X�g.xlsm").Close
End Sub

Sub �u�b�N��ۑ����Ă������()
    Workbooks("�O�b�Y���X�g.xlsm").Close _
    SaveChanges:=True // True:�ύX��ۑ��AFalse:�ύX�����ۑ�
End Sub

Sub �u�b�N�̕ۑ�()
    Workbooks.Add
    ActiveSheet.Name = "���͂悤"
    ActiveWorkbook.SaveAs _
    Filename:="�}�N���̗��K.xlsx"
    ' Filename:="E \Study\ExcelVBA\�}�N���̗��K.xlsx"
    ' E�`VBA\�܂ł�str1���ɑ�����Ďg�p���邱�Ƃ���
End Sub

Sub �㏑���ۑ�()
    ActiveWorkbook.Save
End Sub

Sub ����̐ݒ�()
    With Worksheets(1).PageSetup
        ' �p���̌��������ɂ���
        .Orientation = xlLandscape
        ' �g�奏k���̎w��̓I�t
        .Zoom = False

        ' �c1�y�[�W���Ɏ��߂�
        ' ��1�y�[�W���Ɏ��߂�
        .FitToPagesTall = 1
        .FitToPagesWide = 1

        ' �w�b�_�[�̉E�Ƀt�@�C�����ƃV�[�g����\������
        .RightHeader = "�t�@�C�����F&F(�V�[�g���F&A)"

        ' ���̃w�b�_�[�ɓ��t��\��
        .LeftHeader = "&D"
        ' �����̃t�b�^�[�Ɂu(�y�[�W�ԍ�)/(���y�[�W��)�v��\������
        .CenterFooter = "&P/&N"
    End With
    Worksheets(1).PrintPreview
End Sub

Sub ����C���[�W�\��()
    Worksheets(1).PrintPreview
End Sub

Sub ����̎��s()
    'Worksheets(1).PrintOut copies:=2
End Sub

'------------------------------
' ��7�́F��������E�J��Ԃ������E���b�Z�[�W
'------------------------------

Sub �����𔻒f���ď����𕪊�()
    ' E1�Z�����󗓂̏ꍇ�̓��b�Z�[�W��\��
    If Range("E1").Value = "" Then
        MsgBox "�S���҂���͂��Ă�������"
        ' ����ȊO�̏ꍇ�̓A�N�e�B�u�V�[�g��V�����u�b�N�ɃR�s�[
    Else
        ActiveSheet.Copy
    End If
End Sub

Sub �����𔻒f���ď����𕪊�2()
    If Range("B4").Value = "" Then
        MsgBox "�S���҂���͂��Ă�������"
    Elseif Range("E7").Value >= 7000000 Then
        ActiveSheet.Tab.Color = RGB(0, 153, 255)
    Elseif Range("E7").Value >= 6000000 Then
        ActiveSheet.Tab.Color = RGB(0, 204, 255)
    Else
        ActiveSheet.Tab.ColorIndex = xColorIndexNone
    End If
End Sub

Sub �����𔻒f���ď����𕪊�3()
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

Sub �J��Ԃ�()
    Dim �� As Integer
    For �� = 5 To 10 Step 2
        Range(Cells(��, 1), Cells(��, 4)). _
        Font.ColorIndex = 46
        Next
End Sub

Sub �����̐F��1�s�����ɐݒ�1()
    Range("A5").Select
    Do Until ActiveCell.Value = ""
        ActiveCell.Resize(, 4).Font.ColorIndex = 46
        ActiveCell.Offset(2).Select
    Loop
End Sub

Sub �S�V�[�g�ɑ΂��ď��������s()
    Dim �S�V�[�g As Worksheets
    For Each �S�V�[�g In Worksheets
        �S�V�[�g .Tab.ColorIndex = xlColorIndexNone
        Next
End Sub

Sub �󔒃Z���̍s�폜()
    On Error Goto �G���[���b�Z�[�W
        Range("C4:C8").SpecialCells _
        (xlCellTypeBlanks).EntireRow.Delete
     Exit Sub

        �G���[���b�Z�[�W:
        MsgBox Err.Description
End Sub

Sub �V�[�g�̌���()
    Dim �T���V�[�g As String
    Dim �S�V�[�g As Worksheet
    �T���V�[�g = Range("B1").Value
    For Each �S�V�[�g In Worksheets
        If �S�V�[�g.Name = �T���V�[�g Then
            Worksheets(�T���V�[�g).Select
        End If
        Next
        MsgBox �T���V�[�g & "�V�[�g�͂���܂���"
End Sub

Sub �u�b�N�̌���()
    Dim �T���u�b�N As String
    Dim �u�b�N As Workbook
    �T���u�b�N = Range("B2").Value
    For Each �S�u�b�N In Workbooks
        If �S�u�b�N.Name = �T���u�b�N Then
            Workbooks(�T���u�b�N).Activate
         Exit Sub
        End If
        Next
        MsgBox �T���u�b�N & "�u�b�N�͊J���Ă��܂���"
End Sub

Sub �t�H���_�[���̃u�b�N�ɑ΂��ē������������s()
    Dim �t�H���_�[�� As String
    Dim �u�b�N�� As String
    �t�H���_�[�� = ThisWorkbook.Path & "\"
    �u�b�N�� = Dir(�t�H���_�[�� & "*.xlsx")
    Do While �u�b�N�� <> ""
        MsgBox �u�b�N��
        �u�b�N�� = Dir()
    Loop
End Sub

Sub �f�[�^�]�L()
    Dim �S�V�[�g As Worksheets
    For Each �S�V�[�g In Worksheets
        With �S�V�[�g
            If .Name <> "�ꗗ" Then
                .Range(.Cells(4, 1), Cells(Rows.Count, 1) _
                .End(xlUp).Offset(, 4)).Copy Worksheets("�ꗗ") _
                .Cells(Rows.Count, 1).End(xlUp).Offset(1)
            End If
        End With
        Next
End Sub

Sub �V�[�g���̓���()
    Dim �V�[�g�� As String
    �V�[�g�� = InputBox("�V�[�g������͂��Ă�������", _
    "�V�[�g���̓���")
    If �V�[�g�� <> "" Then
        ActiveSheet.Name = �V�[�g��
    End If
End Sub

Sub ���b�Z�[�W�̕\��()
    MsgBox "�����́A" & vbCrLf & "�ǂ��V�C�ł�", _
    vbInformation, "�V�C    "
End Sub

Sub �f�[�^�]�L2()
    Dim ���� As Integer
    Dim �S�V�[�g As Worksheet
    ���� = MsgBox("�f�[�^���܂Ƃ߂鏈�������s���܂����H", _
    vbYesNo + vbQuestion + vbDefaultButton2, "���s�m�F")
    If ���� = vbYes Then
        For Each �S�V�[�g In Worksheets
            With �S�V�[�g
                If .Name <> "�ꗗ" Then
                    .Range(.Cells(4, 1), .Cells(Rows.Count, 1) _
                    .End(xlUp).Offset(, 4)).Copy Worksheets("�ꗗ") _
                    .Cells(Rows.Count, 1).End(xlUp).Offset(1)
                End If
            End With
            Next
        Else
            MsgBox "������L�����Z�����܂���"
        End If
End Sub

Sub �t�H���_�[�̍쐬()
    MkDir ThisWorkbook.Path & "\���K"
End Sub

Sub �t�@�C�����J����ʂ�\��()
    With Application.FileDialog(msoFileDialogOpen)
        .InitialFileName = ThisWorkbook.Path & "\"
        .FilterIndex = 2
        If .Show = -1 Then .Execute
        End With
End Sub

Sub �t�@�C����ۑ�������()
    With Application.FileDialog(msoFileDialogSaveAs)
        .InitialFileName = ThisWorkbook.Path & "\"
        .FilterIndex = 1
        If .Show = -1 Then .Execute
        End With
End Sub

Sub �s�̌��o���̐ݒ�()
    With Worksheets("����").PageSetup
        .PrintTitleRows = "$1:$3"
        .PrintTitleColumns = ""
    End With
End Sub


Sub ���K1()
    Dim i As Integer
    For i = 2 To 11
        If Cells(i, 3).Value <> 0 Then
            Cells(i, 4).Value = Int(Cells(i, 2).Value / Cells(i, 3).Value)
        Else
            Cells(i, 4).Value = "�G���["
        End If
    Next i
End Sub

Sub ���K2()
    Dim i As Integer
    Dim lastrow As Integer

    lastrow = Cells(Rows.Count, 1).End(xlUp).Row

    For i = 2 To lastrow
        If Cells(i, 3).Value <> 0 Then
            Cells(i, 4).Value = Int(Cells(i, 2).Value * Cells(i, 3).Value)
        Else
            Cells(i, 4).Value = "�G���["
        End If
    Next i
End Sub


Sub ���K3()
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