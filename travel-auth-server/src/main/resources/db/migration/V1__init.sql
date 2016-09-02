CREATE TABLE "user" (
	id bigserial PRIMARY KEY,
	username text NOT NULL,
	password text NOT NULL
);

CREATE TABLE role (
	id bigserial PRIMARY KEY,
	role text NOT NULL
);

CREATE TABLE user_role (
  user_id bigint REFERENCES "user" (id) ON UPDATE CASCADE ON DELETE CASCADE,
  role_id bigint REFERENCES role (id) ON UPDATE CASCADE,
  CONSTRAINT user_role_pkey PRIMARY KEY (user_id, role_id)
);

INSERT INTO "user"(username, password) values ('travel-admin','travel-password');
INSERT INTO "user"(username, password) values ('travel-user','travel-password');

INSERT INTO role(role) values ('ROLE_ADMIN');
INSERT INTO role(role) values ('ROLE_USER');

INSERT INTO user_role(user_id, role_id) values (1,1);
INSERT INTO user_role(user_id, role_id) values (2,2);