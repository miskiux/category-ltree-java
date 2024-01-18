#!/bin/sh
set -e;

psql -v ON_ERROR_STOP=1 --username dev --dbname category <<-EOSQL
		CREATE EXTENSION LTREE;
	EOSQL