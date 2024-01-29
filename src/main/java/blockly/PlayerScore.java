package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class PlayerScore {

public static final int TIMEOUT = 300;

/**
 *
 * @param PlayerScore<fc.entity.PlayerScore>
 *
 * @author Root
 * @since 10/06/2022 20:21:29
 *
 */
public static Var AfterDelete(@ParamMetaData(description = "PlayerScore", id = "f71abde5") Var PlayerScore) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf(CalculateCurrentPrice(PlayerScore,
    Var.valueOf("Delete")));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param PlayerScore<fc.entity.PlayerScore>
 *
 * @author Root
 * @since 10/06/2022 20:21:29
 *
 */
public static Var AfterInsert(@ParamMetaData(description = "PlayerScore", id = "9ac35eca") Var PlayerScore) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf(CalculateCurrentPrice(PlayerScore,
    Var.valueOf("Insert")));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * PlayerScore
 *
 * @param PlayerScore<fc.entity.PlayerScore>
 * @param operation
 *
 * @author Root
 * @since 10/06/2022 20:21:29
 *
 */
public static Var CalculateCurrentPrice(@ParamMetaData(description = "PlayerScore", id = "9ba86fe3") Var PlayerScore, @ParamMetaData(description = "operation", id = "a080c172") Var operation) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (
    Var.valueOf(operation.equals(
    Var.valueOf("Insert"))).getObjectAsBoolean()) {
        cronapi.database.Operations.execute(Var.valueOf("fc.entity.Player"), Var.valueOf("update Player p set p.price = (p.price + :price) where p.id = :id"),Var.valueOf("price",
        cronapi.database.Operations.getField(PlayerScore,
        Var.valueOf("movePrice"))),Var.valueOf("id",
        cronapi.database.Operations.getField(PlayerScore,
        Var.valueOf("player.id"))));
    } else {
        cronapi.database.Operations.execute(Var.valueOf("fc.entity.Player"), Var.valueOf("update Player p set p.price = (p.price + :price) where p.id = :id"),Var.valueOf("price",
        cronapi.math.Operations.multiply(
        cronapi.database.Operations.getField(PlayerScore,
        Var.valueOf("movePrice")),
        Var.valueOf(-1))),Var.valueOf("id",
        cronapi.database.Operations.getField(PlayerScore,
        Var.valueOf("player.id"))));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

