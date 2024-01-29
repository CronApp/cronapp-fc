window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Home = window.blockly.js.blockly.Home || {};

/**
 * @function OnLoad
 *
 * Home
 *
 *
 * @author Root
 * @since 06/06/2022 11:46:23
 *
 */
window.blockly.js.blockly.Home.OnLoadArgs = [];
window.blockly.js.blockly.Home.OnLoad = async function() {
 var route;
  //
  route = (await this.cronapi.server('blockly.Route.ToTake').names('c19ec136').toPromise().run('admin'));
  //
  if (route == 'my-team') {
    //
    this.cronapi.screen.changeView("#/app/logged/my-team",[  ]);
  } else if (route == 'pick-player') {
    //
    this.cronapi.screen.changeView("#/app/logged/pick-player",[  ]);
  }
}
