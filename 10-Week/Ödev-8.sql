# test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

CREATE TABLE employee (

	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE NOT NULL,
	email VARCHAR(100)

);

# Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

Verilerin alındığını site için:

https://www.mockaroo.com

insert into employee (name, birthday, email) values ('Sylvester', '1968-12-18', 'syepiskov0@clickbank.net');
insert into employee (name, birthday, email) values ('Helli', '1984-11-02', 'hallbut1@networkadvertising.org');
insert into employee (name, birthday, email) values ('Llywellyn', '1997-02-04', 'lmackiewicz2@cpanel.net');
insert into employee (name, birthday, email) values ('Jeddy', '2000-03-19', 'jwingham3@theguardian.com');
insert into employee (name, birthday, email) values ('Orv', '1997-10-16', 'ofarrah4@typepad.com');
insert into employee (name, birthday, email) values ('Innis', '1965-05-02', 'idurrett5@marriott.com');
insert into employee (name, birthday, email) values ('Serena', '1993-07-21', 'scorneliussen6@flavors.me');
insert into employee (name, birthday, email) values ('Jethro', '1993-03-22', 'jrabier7@networksolutions.com');
insert into employee (name, birthday, email) values ('Leesa', '1971-08-02', 'lhenden8@discuz.net');
insert into employee (name, birthday, email) values ('Alfie', '1972-10-29', 'abehninck9@dyndns.org');
insert into employee (name, birthday, email) values ('Broderick', '1977-08-13', 'bburberyea@amazon.de');
insert into employee (name, birthday, email) values ('Caspar', '1961-09-25', 'chinkensenb@t-online.de');
insert into employee (name, birthday, email) values ('Rosalie', '1985-01-01', 'rmccreec@cdbaby.com');
insert into employee (name, birthday, email) values ('Nicol', '1963-09-24', 'ncruikshankd@about.me');
insert into employee (name, birthday, email) values ('Eli', '1980-08-18', 'eskeathe@boston.com');
insert into employee (name, birthday, email) values ('Roy', '1971-12-06', 'rwycliffef@scribd.com');
insert into employee (name, birthday, email) values ('Pippa', '1986-04-13', 'pgorewayg@toplist.cz');
insert into employee (name, birthday, email) values ('Joyan', '1995-12-19', 'jbricklebankh@storify.com');
insert into employee (name, birthday, email) values ('Annadiana', '1980-01-31', 'awyeldi@sbwire.com');
insert into employee (name, birthday, email) values ('Clarita', '1998-05-08', 'clarchierj@epa.gov');
insert into employee (name, birthday, email) values ('Pen', '1984-01-23', 'pelietk@bbb.org');
insert into employee (name, birthday, email) values ('Alicia', '1985-09-11', 'abiddlel@tripod.com');
insert into employee (name, birthday, email) values ('Eolanda', '1978-10-05', 'egentilem@blogspot.com');
insert into employee (name, birthday, email) values ('Kris', '1998-10-01', 'kremingtonn@parallels.com');
insert into employee (name, birthday, email) values ('Frazier', '1978-05-01', 'ffinlaysono@adobe.com');
insert into employee (name, birthday, email) values ('Jacqueline', '1974-06-03', 'jthumnelp@ed.gov');
insert into employee (name, birthday, email) values ('Carmela', '1966-09-23', 'ctitteringtonq@imgur.com');
insert into employee (name, birthday, email) values ('Pincas', '1977-12-14', 'podcroftr@github.com');
insert into employee (name, birthday, email) values ('Lynnett', '1979-11-14', 'lblezards@pen.io');
insert into employee (name, birthday, email) values ('Simon', '1963-01-11', 'sslefordt@google.it');
insert into employee (name, birthday, email) values ('Hildegarde', '1997-02-28', 'hparadisu@icq.com');
insert into employee (name, birthday, email) values ('Elliott', '1966-10-03', 'epyfordv@mozilla.org');
insert into employee (name, birthday, email) values ('Gav', '1994-05-04', 'gmuntw@cocolog-nifty.com');
insert into employee (name, birthday, email) values ('Archy', '1963-07-25', 'aminghettix@seesaa.net');
insert into employee (name, birthday, email) values ('Travers', '1988-02-29', 'tmerrydewy@tamu.edu');
insert into employee (name, birthday, email) values ('Kipp', '1977-02-02', 'kashworthz@engadget.com');
insert into employee (name, birthday, email) values ('Fay', '1986-12-15', 'fchumley10@prweb.com');
insert into employee (name, birthday, email) values ('Shirl', '1998-04-17', 'spapachristophorou11@fastcompany.com');
insert into employee (name, birthday, email) values ('Doreen', '1980-08-13', 'dbradnock12@miitbeian.gov.cn');
insert into employee (name, birthday, email) values ('Barbara-anne', '1979-06-09', 'bjacketts13@webnode.com');
insert into employee (name, birthday, email) values ('Debi', '1977-11-03', 'dperfect14@istockphoto.com');
insert into employee (name, birthday, email) values ('Helsa', '1991-06-08', 'hrathbone15@google.es');
insert into employee (name, birthday, email) values ('Jory', '1972-05-31', 'jshrimpling16@ed.gov');
insert into employee (name, birthday, email) values ('Stefano', '1961-11-17', 'scorah17@trellian.com');
insert into employee (name, birthday, email) values ('Lilith', '1992-06-11', 'llamplugh18@mail.ru');
insert into employee (name, birthday, email) values ('Ramsay', '1984-12-16', 'rreynard19@canalblog.com');
insert into employee (name, birthday, email) values ('Merralee', '1963-07-02', 'mtummons1a@freewebs.com');
insert into employee (name, birthday, email) values ('Nara', '1963-05-20', 'nweson1b@skyrock.com');
insert into employee (name, birthday, email) values ('Cammi', '1961-07-11', 'cgimblet1c@topsy.com');
insert into employee (name, birthday, email) values ('Grace', '1986-04-06', 'gstroton1d@marketwatch.com');

# Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

    UPDATE employee
    SET name = 'İbrahim',
        birthday = '1995-01-24'
    WHERE id = 1;

    UPDATE employee
    SET name = 'İbra',
        email = 'bozibrahim13@gmail.com'
    WHERE id = 2;

    UPDATE employee
    SET name = 'Elif',
        birthday = '2001-05-22'
    WHERE id = 3;

    UPDATE employee
    SET name = 'Sema',
        email = 'sema@gmail.com'
    WHERE id = 4;

    UPDATE employee
    SET name = 'Busra',
        birthday = '1996-08-07'
    WHERE id = 5;

 # Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

     DELETE FROM employee
     WHERE id =50;

      DELETE FROM employee
      WHERE name ='Innis';

      DELETE FROM employee
      WHERE name ='Eli';

      DELETE FROM employee
      WHERE id =35;

      DELETE FROM employee
      WHERE email ="lhenden8@discuz.net";