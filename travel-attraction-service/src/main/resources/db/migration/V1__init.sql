CREATE TABLE attraction (
	id bigserial PRIMARY KEY,
	country_id bigint NOT NULL,
	name text NOT NULL,
	detail text NOT NULL
);

INSERT INTO attraction(country_id, name, detail) VALUES (1, 'Cathedral of Our Lady', 'The Cathedral of Our Lady is a Roman Catholic cathedral in Antwerp, Belgium. Today''s see of the Diocese of Antwerp started in 1352 and, although the first stage of construction was ended in 1521, has never been ''completed''. In Gothic style, its architects were Jan and Pieter Appelmans. It contains a number of significant works by the Baroque painter Peter Paul Rubens, as well as paintings by artists such as Otto van Veen, Jacob de Backer and Marten de Vos.');
INSERT INTO attraction(country_id, name, detail) VALUES (1, 'Atomium', 'The Atomium is a building in Brussels originally constructed for Expo 58, the 1958 Brussels World''s Fair. Designed by the engineer André Waterkeyn and architects André and Jean Polak');
INSERT INTO attraction(country_id, name, detail) VALUES (1, 'Caves of Han-sur-Lesse', 'The caves are the result of the underground erosion of a limestone hill by the river Lesse. The river forces its way under the hill over a distance of over 1 kilometer (1⁄2 mi) as the crow flies. The caves have a constant temperature of 13 °C (55 °F) and a high level of humidity.');

INSERT INTO attraction(country_id, name, detail) VALUES (2, 'Efteling', 'Efteling is a fantasy-themed amusement park in Kaatsheuvel in the Netherlands. The attractions are based on elements from ancient myths and legends, fairy tales, fables, and folklore.');