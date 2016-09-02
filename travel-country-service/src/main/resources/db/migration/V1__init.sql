CREATE TABLE country (
	id bigserial PRIMARY KEY,
	iso char(2) NOT NULL,
	name text NOT NULL
);

INSERT INTO country(name, iso) VALUES ('Belgium', 'BE');
INSERT INTO country(name, iso) VALUES ('Netherlands', 'NL');
INSERT INTO country(name, iso) VALUES ('Germany', 'DE');
INSERT INTO country(name, iso) VALUES ('France', 'FR');