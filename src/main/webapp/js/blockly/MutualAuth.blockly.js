window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MutualAuth = window.blockly.js.blockly.MutualAuth || {};

/**
 * @function login
 *
 * MutualAuth
 *
 *
 * @author Root
 * @since 03/06/2022 12:38:21
 *
 */
window.blockly.js.blockly.MutualAuth.loginArgs = [];
window.blockly.js.blockly.MutualAuth.login = async function() {

  //
  (await this.cronapi.authentication.mutualLogin());
}

/**
 * @function signup
 *
 * Descreva esta função...
 *
 *
 * @author Root
 * @since 03/06/2022 12:38:21
 *
 */
window.blockly.js.blockly.MutualAuth.signupArgs = [];
window.blockly.js.blockly.MutualAuth.signup = async function() {

  //
  (await this.cronapi.authentication.mutualSignup());
}
