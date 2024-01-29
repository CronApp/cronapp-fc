window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Dashboard = window.blockly.js.blockly.Dashboard || {};

/**
 * @function OnLoad
 *
 * Dashboard
 *
 *
 * @author Root
 * @since 10/06/2022 11:25:37
 *
 */
window.blockly.js.blockly.Dashboard.OnLoadArgs = [];
window.blockly.js.blockly.Dashboard.OnLoad = async function() {
 var idsFromMyTeam, i, currentId, idsFilter;
  //
  (await this.cronapi.server('blockly.Dashboard.OnLoad').toPromise().run());
  //
  idsFromMyTeam = (await this.cronapi.server('blockly.PickPlayer.GetAllPlayersIdsFromTeam').toPromise().run());
  //
  var i_end = idsFromMyTeam.length;
  var i_inc = 1;
  if (1 > i_end) {
    i_inc = -i_inc;
  }
  for (i = 1; i_inc >= 0 ? i <= i_end : i >= i_end; i += i_inc) {
    //
    currentId = idsFromMyTeam[(i - 1)];
    //
    if (i == 1) {
      //
      idsFilter = ['player_id eq \'',currentId,'\''].join('');
    } else {
      //
      idsFilter = [idsFilter,' or player_id eq \'',currentId,'\''].join('');
    }
  }
  //
  this.cronapi.screen.filter("PlayersWhoScoredInTheRound", idsFilter);
}
