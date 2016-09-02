CREATE TABLE favorite (
	id bigserial PRIMARY KEY,
	attraction_id bigint NOT NULL,
	user_id bigint NOT NULL
);

INSERT INTO favorite(attraction_id, user_id) VALUES (1, 1);