package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Dashboard {

public static final int TIMEOUT = 300;

/**
 *
 * Dashboard
 *
 * @author Root
 * @since 10/06/2022 13:06:49
 *
 */
public static Var OnLoad() throws Exception {
 return new Callable<Var>() {

   private Var myTeam = Var.VAR_NULL;
   private Var round2 = Var.VAR_NULL;

   public Var call() throws Exception {
    myTeam =
    cronapi.database.Operations.query(Var.valueOf("fc.entity.MyTeam"),Var.valueOf("select m from MyTeam m where m.userId = :userId"),Var.valueOf("userId",
    cronapi.util.Operations.callBlockly(Var.valueOf("blockly.UserManager:GetUserIdByLogin"), Var.valueOf("e986361b", Var.VAR_NULL))));
    round2 =
    cronapi.database.Operations.query(Var.valueOf("fc.entity.Round"),Var.valueOf("select r from Round r where r.session.finished = false AND r.finished = false   order by r.number asc"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
    Var.valueOf("teamName"),
    cronapi.database.Operations.getField(myTeam,
    Var.valueOf("this[0].teamName")),
    Var.valueOf("false"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
    Var.valueOf("ownerName"),
    cronapi.database.Operations.getField(myTeam,
    Var.valueOf("this[0].ownerName")),
    Var.valueOf("false"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeContent"),
    Var.valueOf("currentRound"),
    Var.valueOf(
    cronapi.database.Operations.getField(round2,
    Var.valueOf("this[0].number")).getObjectAsString() +
    Var.valueOf("ª Rodada - ").getObjectAsString() +
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.database.Operations.getField(round2,
    Var.valueOf("this[0].stard")),
    Var.valueOf("dd/MM/yyyy"),
    Var.VAR_NULL,
    Var.valueOf("true")).getObjectAsString() +
    Var.valueOf(" à ").getObjectAsString() +
    cronapi.dateTime.Operations.formatDateTime2(
    cronapi.database.Operations.getField(round2,
    Var.valueOf("this[0].end")),
    Var.valueOf("dd/MM/yyyy"),
    Var.VAR_NULL,
    Var.valueOf("true")).getObjectAsString()),
    Var.valueOf("false"));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.filter"),
    Var.valueOf("MatchsFormatedWithImages"),
    Var.valueOf(
    Var.valueOf("round eq \'").getObjectAsString() +
    cronapi.database.Operations.getField(round2,
    Var.valueOf("this[0].id")).getObjectAsString() +
    Var.valueOf("\'").getObjectAsString()));
    return Var.VAR_NULL;
   }
 }.call();
}

}

