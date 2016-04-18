# CSV to SQL (and any text) Converter #

## Конвертор CSV файлов во что угодно, включая SQL запросы ##


---


### Схема работы ###

Есть некая база Clients.xls.

Открываем её  в OpenOffice Calc

![http://ffuudbconv.googlecode.com/files/table.png](http://ffuudbconv.googlecode.com/files/table.png)

сохраняем в in.csv с разделителем ; и без " в словах/полях

![http://ffuudbconv.googlecode.com/files/csv_save.png](http://ffuudbconv.googlecode.com/files/csv_save.png)

in.csv выглядит так

![http://ffuudbconv.googlecode.com/files/csv_txt.png](http://ffuudbconv.googlecode.com/files/csv_txt.png)

Теперь создаем **trafaret.sql**, трафарет для создания запросов (и вообще чего захотите). Переменные выделяем в фигурные скобки - **{var}** . переменные могу дублироваться неоднократно.

![http://ffuudbconv.googlecode.com/files/templ.png](http://ffuudbconv.googlecode.com/files/templ.png)

далее запускаем наш-ваш ffuudbconv.jar, будь то через ffuudbconv.bat в Windows, или через ffuudbconv.sh в **Linux** (JDK желательно самое новое), и выставляем соответствие полей Temlates==CSV

![http://ffuudbconv.googlecode.com/files/PRGR.png](http://ffuudbconv.googlecode.com/files/PRGR.png)

На выходе получаем ожидаемый out.sql

![http://ffuudbconv.googlecode.com/files/SQL.png](http://ffuudbconv.googlecode.com/files/SQL.png)


---


Программка была написана за 2 дня для избежания ручного ввода более  3к записей xls в новую БД на MySQL.

Буду рад если кто то еще заинтересуется и подсоединится к проекту.


---


### ToDo: ###

**OpenCSVDialog;**

**SaveSQLDialog;**

**Gui fixes;**


---


### ИМХО ###

тулса полезная может оказаться...