DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS address;

CREATE TABLE employee (
  id VARCHAR(250) PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  date_of_birth VARCHAR(250) DEFAULT NULL,
  address_id INT NOT NULL
);

CREATE TABLE address (
  address_id INT PRIMARY KEY,
  line1 VARCHAR(250) NOT NULL,
  line2 VARCHAR(250) DEFAULT NULL,
  city VARCHAR(250) NOT NULL,
  state VARCHAR(250) NOT NULL,
  country VARCHAR(250) NOT NULL,
  zip_code VARCHAR(250) NOT NUll
);

INSERT INTO address (address_id, line1, line2, city, state, country, zip_code) VALUES
  ( 1, 'v', 'K', 'gudha', 'raj', 'ind','123');

INSERT INTO employee (id, first_name, last_name, date_of_birth, address_id) VALUES
  ('1', 'vikash', 'Kumar', '19-JUl-1990', 1);

commit;
