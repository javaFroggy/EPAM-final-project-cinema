package com.epam.project.dao;

public enum DataBaseSelector {
    MYSQL{
        @Override
        public String toString() {
            return "MySQL";
        }
    },
    ORACLE{
        @Override
        public String toString() {
            return "Oracle";
        }
    },
    POSTGRES{
        @Override
        public String toString() {
            return "Postgres";
        }
    },
    MS_SQL{
        @Override
        public String toString() {
            return "Microsoft SQL Client";
        }
    }
}
