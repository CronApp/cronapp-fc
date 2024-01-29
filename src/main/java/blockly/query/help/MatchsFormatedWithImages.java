package blockly.query.help;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MatchsFormatedWithImages {

public static final int TIMEOUT = 300;

/**
 *
 * MatchsFormatedWithImages
 *
 * @param data
 *
 * @author Root
 * @since 10/06/2022 20:01:12
 *
 */
public static Var CreateTeamScore(@ParamMetaData(description = "data", id = "70f71248") Var data) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    cronapi.object.Operations.getObjectField(data,
    Var.valueOf("team1_name"));
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(data,
    Var.valueOf("team1Score")))
    .negate().getObjectAsBoolean()) {
        item =
        Var.valueOf(
        item.getObjectAsString() +
        Var.valueOf(" ").getObjectAsString() +
        cronapi.object.Operations.getObjectField(data,
        Var.valueOf("team1Score")).getObjectAsString());
    }
    item =
    Var.valueOf(
    item.getObjectAsString() +
    Var.valueOf(" x ").getObjectAsString());
    if (
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(data,
    Var.valueOf("team2Score")))
    .negate().getObjectAsBoolean()) {
        item =
        Var.valueOf(
        item.getObjectAsString() +
        cronapi.object.Operations.getObjectField(data,
        Var.valueOf("team2Score")).getObjectAsString() +
        Var.valueOf(" ").getObjectAsString());
    }
    item =
    Var.valueOf(
    item.getObjectAsString() +
    cronapi.object.Operations.getObjectField(data,
    Var.valueOf("team2_name")).getObjectAsString());
    return item;
   }
 }.call();
}

}

