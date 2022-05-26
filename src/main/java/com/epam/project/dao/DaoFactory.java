package com.epam.project.dao;


import com.epam.project.exceptions.DataBaseConnectionException;
import com.epam.project.exceptions.DataBaseNotSupportedException;
import org.apache.log4j.Logger;

//TODO
public abstract class DaoFactory{

    private static final Logger LOGGER = Logger.getLogger(DaoFactory.class);

    /**
     * Opens connection to DataSource
     * @throws DataBaseConnectionException if unable to open connection with data source
     */
    public abstract void openConnection() throws DataBaseConnectionException;

    /**
     * Closes connection with DataSource
     * @throws DataBaseConnectionException if unable to close connection
     */
    public abstract void closeConnection() throws DataBaseConnectionException;

    /**
     * Begins transaction
     * @throws DataBaseConnectionException if unable to begin transaction
     */
    public abstract void beginTransaction() throws DataBaseConnectionException;

    /**
     * Commits changes, made in transaction progress
     * @throws DataBaseConnectionException if unable to commit transaction
     */
    public abstract void commitTransaction() throws DataBaseConnectionException;

    /**
     * Rolls back changes made in transaction
     * @throws DataBaseConnectionException if unable to rollback transaction
     */
    public abstract void rollBackTransaction() throws DataBaseConnectionException;

    public static DaoFactory getDaoFactory(DataBaseSelector dataBase)
            throws DataBaseNotSupportedException {
        switch(dataBase){
            case MYSQL:
                return new MySQLDaoFactory();

            case MS_SQL:
                LOGGER.error("Database " + dataBase);
                throw new DataBaseNotSupportedException(dataBase);
            case ORACLE:
                LOGGER.error("Database " + dataBase);
                throw new DataBaseNotSupportedException(dataBase);
            case POSTGRES:
                LOGGER.error("Database " + dataBase);
                throw new DataBaseNotSupportedException(dataBase);
            default:
                LOGGER.error("Database type not set");
                throw new DataBaseNotSupportedException("Database type not set");

        }
    }
}
