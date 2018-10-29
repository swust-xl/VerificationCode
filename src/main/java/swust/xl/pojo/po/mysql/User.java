/*
 * This file is generated by jOOQ.
*/
package swust.xl.pojo.po.mysql;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import swust.xl.pojo.po.mysql.tables.Article;
import swust.xl.pojo.po.mysql.tables.Comments;
import swust.xl.pojo.po.mysql.tables.Users;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User extends SchemaImpl {

    private static final long serialVersionUID = 917986106;

    /**
     * The reference instance of <code>user</code>
     */
    public static final User USER = new User();

    /**
     * The table <code>user.article</code>.
     */
    public final Article ARTICLE = swust.xl.pojo.po.mysql.tables.Article.ARTICLE;

    /**
     * The table <code>user.comments</code>.
     */
    public final Comments COMMENTS = swust.xl.pojo.po.mysql.tables.Comments.COMMENTS;

    /**
     * The table <code>user.users</code>.
     */
    public final Users USERS = swust.xl.pojo.po.mysql.tables.Users.USERS;

    /**
     * No further instances allowed
     */
    private User() {
        super("user", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Article.ARTICLE,
            Comments.COMMENTS,
            Users.USERS);
    }
}
