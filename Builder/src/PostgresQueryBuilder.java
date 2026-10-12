public class PostgresQueryBuilder implements QueryBuilder {
    private String selectClause = "";
    private String whereClause = "";
    private String limitClause = "";

    @Override
    public QueryBuilder select(String... fields) {
        this.selectClause = "SELECT " + String.join(", ", fields);
        return this;
    }

    @Override
    public QueryBuilder where(String condition) {
        this.whereClause = " WHERE " + condition;
        return this;
    }

    @Override
    public QueryBuilder limit(int limit) {
        this.limitClause = " LIMIT " + limit;
        return this;
    }

    @Override
    public String getSQL() {
        return (selectClause + " FROM table" + whereClause + limitClause + ";").trim();
    }
}