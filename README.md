# 設計一個「個人書籍」管理系統

+ 輸入**帳號**及**密碼**才能登入系統

+ 帳號及密碼統一規定，**帳號**`cis`及**密碼**`1234`

+ 系統分**使用者功能**及**管理者功能**

+ **特殊自訂功能**

## 使用者功能
+ 所有資料存在文字檔案內(一個或多個檔案依實際系統設計為準)

	- 用普通文字編輯器可直接開檔觀看及修改
	
+ 能**新增**一筆資料包含

	- 書名、作者、出版社、編號、分類、出版年份
	- 能做資料檢查(進階功能)
	
		- 書名:文字
		- 作者:文字
		- 出版社:文字
		- 編號:以１個英文字母開頭，接著是５位數字
		- 分類: 文字
		- 出版年份：４位數字
		
+ 能**顯示所有**資料

	- 能依某一欄位做排序顯示(進階功能)
	- 能分頁顯示(進階功能)
	
+ 能**顯示某一分類**的所有資料

	- 能依某一欄位做排序顯示(進階功能)
	- 能分頁顯示
	
+ 能**查尋**某一筆資料

	- 依書名、出版社、編號、分類、出版年份等
	- (自行決定那些欄位)
	
+ 能**修改**某一筆資料

+ 能**刪除**某一筆資料

+ 要有一個**主選單**及**次選單**

	- 每完成一項功能要回到主選單或次選單
	- 選單要有**回到上一層**或**離開系統**的功能
	
+ 存到檔案的資料可設上限**128筆**(基本要求，用一變數或常數來指定)或**不限制**(進階功能)

## 管理者功能
+ 資料**由小到大**排列：可將資料排序顯示並寫入檔案

+ 資料**由大到小**排列：可將資料排序顯示並寫入檔案

+ 使用者帳號設定：可設定是否要讓系統記住使用者帳號

+ 回上一層：回到上一個選單

+ 離開：結束系統使用

## 自訂功能
+ 有開始系統的介面(除了主選單與次選單之外)

+ 可用管理者設定讓系統記住(或取消記住)使用者帳號

+ 管理者設定要排序後，可預覽排序後的結果再決定是否確定要保留變更

+ 使用者新增一筆資料後可決定要不要再新增才回到主選單

+ 可針對特定項目去查詢所有符合資料(不一定只有一筆)

+ 查詢功能中若只輸入部分書名也可查詢到相關的書

+ 刪除資料前可先確認是否確定要刪除，否則資料不變動

+ 分頁顯示中的每筆資料都有序號可讓使用者知道看到第幾筆


