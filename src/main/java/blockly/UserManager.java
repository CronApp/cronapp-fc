package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UserManager {

public static final int TIMEOUT = 300;

/**
 *
 * UserManager
 *
 * @param Entidade<app.entity.User>
 *
 * @author Root
 * @since 06/06/2022 14:36:56
 *
 */
public static Var BeforeDelete(@ParamMetaData(description = "Entidade", id = "6d0d416f") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.beforeDelete(Entidade);
   }
 }.call();
}

/**
 *
 * UserManager
 *
 * @param Entidade<app.entity.User>
 *
 * @author Root
 * @since 06/06/2022 14:36:56
 *
 */
public static Var BeforeInsert(@ParamMetaData(description = "Entidade", id = "5df10557") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.beforeInsert(Entidade);
   }
 }.call();
}

/**
 *
 * UserManager
 *
 * @param Entidade<app.entity.User>
 *
 * @author Root
 * @since 06/06/2022 14:36:56
 *
 */
public static Var BeforeUpdate(@ParamMetaData(description = "Entidade", id = "8537bddc") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.beforeUpdate(Entidade);
   }
 }.call();
}

/**
 *
 * @param login
 *
 * @author Root
 * @since 06/06/2022 14:36:56
 *
 */
public static Var GetUserIdByLogin(@ParamMetaData(description = "param_login", id = "9bf8433e") Var param_login) throws Exception {
 return new Callable<Var>() {

   // param
   private Var login = param_login;
   // end
   private Var users = Var.VAR_NULL;
   private Var id2 = Var.VAR_NULL;

   public Var call() throws Exception {
    if (
    cronapi.logic.Operations.isNullOrEmpty(login).getObjectAsBoolean()) {
        login =
        cronapi.util.Operations.getCurrentUserName();
    }
    users =
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.userName = :userName"),Var.valueOf("userName",login));
    if (
    cronapi.database.Operations.hasElement(users).getObjectAsBoolean()) {
        id2 =
        cronapi.database.Operations.getField(users,
        Var.valueOf("this[0].id"));
    }
    return id2;
   }
 }.call();
}

/**
 *
 * Descreva esta função...
 *
 * @param Entidade<app.entity.User>
 *
 * @author Root
 * @since 06/06/2022 14:36:56
 *
 */
public static Var Normalize(@ParamMetaData(description = "Entidade", id = "83c51450") Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var login = Var.VAR_NULL;
   private Var users = Var.VAR_NULL;
   private Var id2 = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.authentication.Operations.normalize(Entidade);
   }
 }.call();
}

}

