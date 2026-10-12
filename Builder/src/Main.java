public class Main {
    public static void main(String[] args) {
        QueryBuilder postgresBuilder = new PostgresQueryBuilder();
        String pgQuery = postgresBuilder
                .select("id", "username", "email")
                .where("age >= 18")
                .limit(10)
                .getSQL();

        System.out.println(pgQuery);

        QueryBuilder mysqlBuilder = new MySqlQueryBuilder();
        String mysqlQuery = mysqlBuilder
                .select("product_id", "title", "price")
                .where("price < 1000")
                .limit(5)
                .getSQL();

        System.out.println(mysqlQuery);
    }
}