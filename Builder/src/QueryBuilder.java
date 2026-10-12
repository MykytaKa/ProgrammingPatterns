public interface QueryBuilder {
    QueryBuilder select(String... fields);
    QueryBuilder where(String condition);
    QueryBuilder limit(int limit);
    String getSQL();
}