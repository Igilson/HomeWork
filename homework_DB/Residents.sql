CREATE SEQUENCE base_sequence;
INSERT INTO street(id, name) VALUES
(nextval('base_sequence'), 'grusheva'),
(nextval('base_sequence'), 'naukova'),
(nextval('base_sequence'), 'pushkinska'),
(nextval('base_sequence'), 'sumskaya'),
(nextval('base_sequence'), 'shevchenko'),
(nextval('base_sequence'), 'niyutona'),
(nextval('base_sequence'), 'gagarina'),
(nextval('base_sequence'), 'studenchiskaya'),
(nextval('base_sequence'), 'beketova'),
(nextval('base_sequence'), 'otakarayarosha'),
(nextval('base_sequence'), 'vesnina'),
(nextval('base_sequence'), 'garibaldi');



INSERT INTO person(id, firstname, lastname, age, id_street) VALUES
(nextval('base_sequence'), 'Kostya', 'Kozlow', 21, (SELECT Id FROM street WHERE Name = null)),
(nextval('base_sequence'), 'Misha', 'Tupak', 64, (SELECT Id FROM street WHERE Name = 'naukova')),
(nextval('base_sequence'), 'Kostya', 'Tkach', 44, (SELECT Id FROM street WHERE Name = 'pushkinska')),
(nextval('base_sequence'), 'Artem', 'Berezov', 33, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Evgeniy', 'Valdemar', 6, (SELECT Id FROM street WHERE Name = 'shevchenko')),
(nextval('base_sequence'), 'Kostya', 'Pirozhkov', 3, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Evgeniy', 'Stepanov', 1, (SELECT Id FROM street WHERE Name = 'garibaldi')),
(nextval('base_sequence'), 'Olga', 'Buligina', 77, (SELECT Id FROM street WHERE Name = 'vesnina')),
(nextval('base_sequence'), 'Oksana', 'Micay', 115, (SELECT Id FROM street WHERE Name = 'studenchiskaya')),
(nextval('base_sequence'), 'Vika', 'Valinova', 32, (SELECT Id FROM street WHERE Name = null)),
(nextval('base_sequence'), 'Slavik', 'Skorodelov', 44, (SELECT Id FROM street WHERE Name = 'sumskaya')),
(nextval('base_sequence'), 'Anton', 'Valinov', 42, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Mark', 'Tven', 44, (SELECT Id FROM street WHERE Name = 'vesnina')),
(nextval('base_sequence'), 'Vova', 'Huevo', 6, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Vova', 'Rediska', 10, (SELECT Id FROM street WHERE Name = 'naukova')),
(nextval('base_sequence'), 'Kolyan', 'Uvajaemiy', 58, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Oksana', 'Poklipach', 35, (SELECT Id FROM street WHERE Name = null)),
(nextval('base_sequence'), 'Artem', 'Kozlow', 38, (SELECT Id FROM street WHERE Name = 'sumskaya')),
(nextval('base_sequence'), 'Vitya', 'Kopiletc', 61, (SELECT Id FROM street WHERE Name = 'beketova')),
(nextval('base_sequence'), 'Kolyan', 'Ueban', 48, (SELECT Id FROM street WHERE Name = 'grusheva')),
(nextval('base_sequence'), 'Artem', 'Kozlow', 55, (SELECT Id FROM street WHERE Name = 'niyutona')),
(nextval('base_sequence'), 'Evgeniy', 'Buligin', 14, (SELECT Id FROM street WHERE Name = 'naukova')),
(nextval('base_sequence'), 'Oksana', 'Glavnaya', 77, (SELECT Id FROM street WHERE Name = null));
