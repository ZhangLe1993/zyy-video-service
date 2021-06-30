<template>
  <div>
    <div id="login-box_home" :style="dialogVisible">
      <div class="login-box_l">
        <img :src="loginSide" alt="">
      </div>
      <div class="login-box_r">
        <div class="login-box_close" @click="handleClose"><i class="iconfont icon-guanbi"></i></div>
        <p class="login-box_logo"><img :src="logo2" alt=""></p>

        <p class="login-box_desc" :style="operationToolsVisibleStyle"><span>超过18,084,862名用户加入沐婉清网观看视频</span></p>

        <div class="operation-tools" :style="operationToolsVisibleStyle">
          <a class="new-phone-btn" href="javascript:void(0);" name="login_phone" @click="toPhoneLoginPanel(login)">
            <div class="contact-phone">
              <p>{{login?loginWA.title:registWA.title}}</p>
            </div>
            <div class="lastTime">（上次登录）</div></a>
          <!-- <a href="javascript:;" class="switch-login-passwd">账号密码登录</a> -->
          <div class="operation-tool contact-qq">
            <a name="login_qq" onclick="window.open('/?s=/Home/Auth/qqLogin','QQ登录到沐婉清网', 'width=600,height=520,left=200,top=200,toolbar=no,resizable=no')">
              <div class="operation-area">
                <i class="iconfont icon-waiyin-qq"></i>
              </div>
              <p>{{login?loginWA.qqLogin:registWA.qqRegist}}</p>
            </a>
          </div>
          <div class="operation-tool contact-wx">
            <a name="login_weixin" href="javascript:void(0);" @click="showWeixinPop()">
              <div class="operation-area">
                <i class="iconfont icon-waiyin-weixin"></i>
              </div>
              <p>{{login?loginWA.wxLogin:registWA.wxRegist}}</p>
            </a>
          </div>
        </div>

        <!-- 登录内容part -->
        <div :class="phoneLoginPanelVisibleClass">
          <p class="login-area_ways">
            <span :class="loginActive" name="tab_code_login" @click="toVerfyLoginPanel">验证码登录</span>
            <span name="tab_passwd_login" :class="loginNotActive" @click="toPasswordLoginPanel">账号密码登录</span>
          </p>
          <div class="login-area_content">
            <div :class="verfyLoginPanelVisible">
              <input @input="onChange" v-model="phone" type="text" maxlength="11" class="login-area_number js-input-phone js-focus-phone" name="phone_code_login" data-phone="login-area_number" placeholder="请输入手机号或邮箱"/>
              <div class="code">
                <input type="number" v-model="code" class="login-area_code js-area-code" name="code_code_login" data-area="login-area_code" placeholder="请输入验证码" autocomplete="off">
                <form theme="simple" onsubmit="return false;" style="height:100%;">
                  <button :class="showVerfyBtn" name="getcode_code_login">获取验证码</button>
                </form>
              </div>
              <button class="js-phone-login-btn login-area_item-passwd js-btn-submit" name="btn_code_login" @click="codeLogin">登录</button>
            </div>
            <div :class="passwordLoginPanelVisible">
              <input type="text" v-model="phone2" class="login-area_account js-focus-phone" name="phone_passwd_login" placeholder="请输入手机或邮箱" autocomplete="off">
              <div>
                <input type="password" v-model="password"  class="login-area_pwd" name="passwd_passwd_login" placeholder="请输入密码" autocomplete="off">
              </div>
              <a href="/register/resetPasswd" target="_blank">忘记密码</a>
              <button class="js-account-login-btn  js-btn-submit" name="btn_passwd_login" @click="passwordLogin">登录</button>
            </div>
          </div>
        </div>

        <!-- 注册内容part -->
        <div :class="phoneRegistPanelClass">
          <p class="regist-area_ways">
            <span :class="registActive" name="tab_code_regist" @click="toVerfyRegistPanel" >验证码注册</span>
            <span :class="registNotActive" @click="toPasswordRegistPanel" name="tab_passwd_regist">账号密码注册</span>
          </p>
          <div class="regist-area_content">
            <div :class="verfyRegistPanelVisible">

              <input  @input="onChange1" type="text" maxlength="11" v-model="phone3" class="regist-area_number js-input-phone js-focus-phone" name="phone_code_regist" data-phone="regist-area_number" placeholder="请输入手机号或邮箱">
              <div class="code">
                <input type="number" v-model="code3" class="regist-area_code js-area-code" name="code_code_regist" data-area="js-area-code" placeholder="请输入验证码" autocomplete="off">
                <form theme="simple" onsubmit="return false;" style="height:100%;">
                  <button :class="showVerfyBtn1" name="getcode_code_regist">获取验证码</button>
                </form>
              </div>
              <button class="js-phone-regist-btn js-btn-submit" name="btn_code_regist" @click="codeRegist" >注册</button>
            </div>
            <div :class="passwordRegistPanelVisible">
              <input  @input="onChange2" type="text" v-model="phone4" class="regist-area_account js-input-phone js-focus-phone" name="phone_passwd_regist" data-phone="regist-area_account" placeholder="请输入手机号或邮箱" autocomplete="off">
              <div class="code">
                <input type="number" v-model="code4" class="regist-area_code js-area-code" name="code_passwd_regist" data-area="regist-area_code" placeholder="请输入验证码" autocomplete="off">
                <form theme="simple" onsubmit="return false;" style="height:100%;">
                  <button :class="showVerfyBtn2" name="getcode_passwd_regist">获取验证码</button>
                </form>
              </div>
              <div>
                <input type="password" v-model="password4" class="regist-area_pwd js-area-pwd" name="passwd_passwd_regist" placeholder="请设置密码" autocomplete="off">
              </div>
              <button class="js-account-regist-btn js-btn-submit" name="btn_passwd_regist" style="margin-top: 15px;" @click="passwordRegist" >注册</button>
            </div>
          </div>
        </div>

        <div class="bottom-control">
          <p :class="goRegist" @click="toRegistPanel">没有账号？<span class="go-regist_span">立即注册</span></p>
          <p :class="goLoginPhone" @click="toLoginPanel">已有账号，<span class="go-login_span">立即登录</span></p>
          <p :class="goLoginQqWx" @click="toWexQQLoginPanel"><i class="iconfont icon-jiantouxiao-zuo"></i>微信/QQ登录</p>
          <p :class="goRegistQqWx" @click="toWexQQRegistPanel"><i class="iconfont icon-jiantouxiao-zuo"></i>微信/QQ注册</p>
        </div>
        <p :class="tkClass">注册即表明同意<a href="/protocol.html" target="_blank">使用条款和隐私策略</a></p>
      </div>
    </div>
    <div id="new-login-mask" :style="dialogVisible"></div>
  </div>
</template>

<script>
export default {
  name: "AccessPanel",
  props: {
    dialogVisible: String,
    closePanel: Function,
  },
  data() {
    return {
      operationToolsVisibleStyle: 'display:block;',
      phoneLoginPanelVisibleClass: 'login-area_new hide',
      phoneRegistPanelClass: 'regist-area_new hide',
      goLoginQqWx: 'go-login_qqwx hide',
      goRegistQqWx: 'go-regist_qqwx hide',
      goLoginPhone: 'go-login hide',
      goRegist: 'go-regist',
      showVerfyBtn: 'disabled js-get-verify-btn js-get-verify-btn-0',
      showVerfyBtn1: 'disabled js-get-verify-btn js-get-verify-btn-1',
      showVerfyBtn2: 'disabled js-get-verify-btn js-get-verify-btn-2',
      loginActive: 'active',
      loginNotActive: '',
      registActive: 'active',
      registNotActive: '',
      verfyLoginPanelVisible: 'login-area_item login-area_item-phone js-area_item',
      passwordLoginPanelVisible: 'login-area_item login-area_item-passwd js-area_item hide',
      verfyRegistPanelVisible: 'regist-area_item regist-area_item-phone js-area_item',
      passwordRegistPanelVisible: 'regist-area_item regist-area_item-passwd js-area_item hide',
      login: true,
      loginWA: { qqLogin: 'QQ登录', wxLogin: '微信登录', title: '手机/邮箱登录' },
      registWA: { qqRegist: 'QQ注册', wxRegist: '微信注册', title: '手机/邮箱注册' },
      tkClass: 'regist-text-tips hide',
      logo2: require("@/assets/logo2.png"),
      loginSide: require("@/assets/login-side_1.png"),
      //
      phone: '',
      code: '',
      phone2: '',
      password: '',
      phone3: '',
      code3: '',
      phone4: '',
      code4: '',
      password4: '',
    };
  },
  methods: {
    handleClose() {
      this.closePanel();
    },
    toPhoneRegistPanel() {
      this.operationToolsVisibleStyle = 'display:none;';
      this.phoneRegistPanelClass = 'regist-area_new';
      this.goRegistQqWx = 'go-regist_qqwx';
      this.goLoginQqWx = 'go-login_qqwx hide';
      this.tkClass = 'regist-text-tips hide';
    },
    toPhoneLoginPanel(login) {
      if(login) {
        this.operationToolsVisibleStyle = 'display:none;';
        this.phoneLoginPanelVisibleClass = 'login-area_new';
        this.goLoginQqWx = 'go-login_qqwx';
      } else {
        this.toPhoneRegistPanel();
      }
      // this.goLoginPhone = 'go-login';
    },

    toWexQQLoginPanel() {
      this.login = true;
      this.operationToolsVisibleStyle = 'display:block;';
      this.phoneLoginPanelVisibleClass = 'login-area_new hide';
      this.goLoginQqWx = 'go-login_qqwx hide';
      // this.goLoginPhone = 'go-login hide';
    },
    toWexQQRegistPanel() {
      this.login = false;
      this.operationToolsVisibleStyle = 'display:block;';
      this.phoneRegistPanelClass = 'regist-area_new hide';
      this.goRegistQqWx = 'go-regist_qqwx hide';
      // this.goLoginPhone = 'go-login hide';
    },
    showWeixinPop() {

    },
    // 登录面板密码和验证码切换
    toPasswordLoginPanel() {
      this.loginActive = '';
      this.loginNotActive = 'active';
      this.verfyLoginPanelVisible= 'login-area_item login-area_item-phone js-area_item hide';
      this.passwordLoginPanelVisible = 'login-area_item login-area_item-passwd js-area_item';
    },
    toVerfyLoginPanel() {
      this.loginActive = 'active';
      this.loginNotActive = '';
      this.verfyLoginPanelVisible= 'login-area_item login-area_item-phone js-area_item';
      this.passwordLoginPanelVisible= 'login-area_item login-area_item-passwd js-area_item hide';
    },

    // 注册密码和验证码面板切换
    toVerfyRegistPanel() {
      this.registActive = 'active';
      this.registNotActive = '';
      this.verfyRegistPanelVisible= 'regist-area_item regist-area_item-phone js-area_item';
      this.passwordRegistPanelVisible= 'regist-area_item regist-area_item-passwd js-area_item hide';
    },
    toPasswordRegistPanel() {
      this.registActive = '';
      this.registNotActive = 'active';
      this.verfyRegistPanelVisible= 'regist-area_item regist-area_item-phone js-area_item hide';
      this.passwordRegistPanelVisible= 'regist-area_item regist-area_item-passwd js-area_item';
    },
    /**
     *
     */
    toRegistPanel() {
      this.login = false;
      this.tkClass = 'regist-text-tips';
      this.goRegist = 'go-regist hide';
      this.goLoginPhone = 'go-login';
      this.toWexQQLoginPanel();
      this.toWexQQRegistPanel();
    },
    toLoginPanel() {
      this.login = true;
      this.tkClass = 'regist-text-tips hide';
      this.goRegist = 'go-regist';
      this.goLoginPhone = 'go-login hide';
      this.toWexQQRegistPanel();
      this.toWexQQLoginPanel();
    },
    onChange(e) {
      console.log(e);
      if(this.isPone(this.phone) || this.isEmail(this.phone)) {
        this.showVerfyBtn = 'js-get-verify-btn js-get-verify-btn-0';
      } else {
        this.showVerfyBtn = 'disabled js-get-verify-btn js-get-verify-btn-0';
      }
    },
    onChange1(e) {
      console.log(e)
      if(this.isPone(this.phone3) || this.isEmail(this.phone3)) {
        this.showVerfyBtn1 = 'js-get-verify-btn js-get-verify-btn-1';
      } else {
        this.showVerfyBtn1 = 'disabled js-get-verify-btn js-get-verify-btn-1';
      }
    },
    onChange2(e) {
      console.log(e)
      if(this.isPone(this.phone4) || this.isEmail(this.phone4)) {
        this.showVerfyBtn2 = 'js-get-verify-btn js-get-verify-btn-2';
      } else {
        this.showVerfyBtn2 = 'disabled js-get-verify-btn js-get-verify-btn-2';
      }
    },
    codeLogin() {
      const obj = { phone: this.phone, code: this.code };

      if(this.phone === '') {
        this.open('手机号或邮箱不能为空');
        return;
      }
      if(!this.isPone(this.phone) && !this.isEmail(this.phone)) {
        this.open('手机号或邮箱格式不正确');
        return;
      }
      if(this.code === ''){
        this.open('验证码不能为空');
        return;
      }
      console.log(obj);
    },
    passwordLogin() {
      const obj = { phone: this.phone2, password: this.password };
      if(this.phone2 === '') {
        this.open('手机号或邮箱不能为空');
        return;
      }
      if(!this.isPone(this.phone2) && !this.isEmail(this.phone2)) {
        this.open('手机号或邮箱格式不正确');
        return;
      }
      if(this.password === '') {
        this.open('密码不能为空');
        return;
      }
      console.log(obj);
    },
    codeRegist() {
      const obj = { phone: this.phone3, code: this.code3 };
      if(this.phone3 === '') {
        this.open('手机号或邮箱不能为空');
        return;
      }
      if(!this.isPone(this.phone3) && !this.isEmail(this.phone3)) {
        this.open('手机号或邮箱格式不正确');
        return;
      }
      if(this.code3 === ''){
        this.open('验证码不能为空');
        return;
      }
      console.log(obj);
    },
    passwordRegist() {
      if(this.phone4 === '') {
        this.open('手机号或邮箱不能为空');
        return;
      }
      if(!this.isPone(this.phone4) && !this.isEmail(this.phone4)) {
        this.open('手机号或邮箱格式不正确');
        return;
      }
      if(this.code4 === ''){
        this.open('验证码不能为空');
        return;
      }
      if(this.password4 === ''){
        this.open('密码不能为空');
        return;
      }
      const obj = { phone: this.phone4, code: this.code4, password: this.password4 };
      console.log(obj);
    },
    open(text) {
      this.$notify({
        title: '警告',
        message: text,
        type: 'warning'
      });
    },
    isPone(text) {
      var myreg = /^1[3,4,5,6,7,8]\d{9}$/;
      if (!myreg.test(text)) {
        return false;
      } else {
        return true;
      }
    },
    isEmail(text) {
      var myreg = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
      if (!myreg.test(text)) {
        return false;
      } else {
        return true;
      }
    },
    //
  },
}
</script>

<style scoped>

#login-box_home {
  width: 662px;
  height: 400px;
  display: none;
  background: #fff;
  position: fixed;
  left: 50%;
  top: 50%;
  margin-left: -330px;
  margin-top: -200px;
  z-index: 1002;
  box-shadow: 0 2px 10px 0 rgba(0,0,0,.3);
  border-radius: 10px;
  overflow: hidden;
  animation: winAlertIn .4s;
}

#new-login-mask {
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, .5);
  position: fixed;
  left: 0;
  top: 0;
  z-index: 1001;
}

.login-box_l {
  width: 240px;
  height: 400px;
  background: #87ceeb;
  float: left;
}

.login-box_r {
  width: 420px;
  height: 400px;
  float: left;
  position: relative;
  box-sizing: border-box;
  padding: 30px;
}
div {
  display: block;
  padding: 0;
  margin: 0;
}

.login-box_close {
  position: absolute;
  width: 40px;
  height: 40px;
  right: 0;
  top: 0;
  line-height: 40px;
  text-align: center;
  cursor: pointer;
}

.login-box_close i {
  display: block;
  color: #999;
  font-size: 14px;
  transition: .3s;
}

.iconfont {
  font-family: "iconfont" !important;
  font-size: 16px;
  font-style: normal;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

.icon-guanbi:before {
  content: "\e604";
}

.icon-guanbi:hover {
  -webkit-transform: rotate(360deg);
  -moz-transform: rotate(360deg);
  transform: rotate(360deg);
}

.login-box_logo {
  height: 30px;
  margin: 10px auto 30px;
  text-align: center;
}

.login-box_logo img {
  height: 30px;
  display: inline-block;
}

p {
  display: block;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}

img {
  border: none;
}

.login-box_desc {
  height: 1px;
  display: block;
  background: #d8d8d8;
  position: relative;
  margin-bottom: 69px;
}

.login-box_desc span {
  font-size: 14px;
  color: #999;
  height: 20px;
  line-height: 20px;
  position: absolute;
  background: #fff;
  top: -9px;
  padding: 0 12px;
  left: 22px;
}

.operation-tools {
  overflow: hidden;
}

.new-phone-btn {
  font-size: 12px;
  line-height: 17px;
  position: absolute;
  left: 30px;
  bottom: 17px;
  color: #999;
}

a {
  color: #666;
  text-decoration: none;
  transition: all .2s;
  cursor: pointer;
}

.operation-tools .contact-phone {
  display: inline-block;
}

.operation-tools .lastTime {
  display: inline-block;
  font-size: 12px;
  cursor: default;
  margin-top: 0;
}

.contact-qq {
  margin-left: 47px;
}

.operation-tool {
  width: 100px;
  float: left;
  text-align: center;
  box-sizing: border-box;
}

.operation-tool.contact-qq .operation-area, .operation-tool.contact-qq .operation-area i, .operation-tool.contact-qq p {
  color: #2caeff;
  border-color: #2caeff;
}

.operation-tool .operation-area {
  width: 98px;
  height: 98px;
  background: #fff;
  border: 1px solid #f80;
  border-radius: 6px;
  margin-bottom: 10px;
  transition: .2s;
}

.operation-tool .operation-area i {
  font-size: 46px;
  line-height: 98px;
  color: #f80;
  background: #fff;
  transition: .2s;
}

.operation-tool.contact-qq .operation-area:hover, .operation-tool.contact-qq .operation-area:hover i {
  background: #2caeff;
  color: #fff;
}

.icon-waiyin-qq:before {
  content: "\e603";
}

.contact-wx {
  float: right;
  margin-right: 47px;
}

.operation-tool.contact-wx .operation-area, .operation-tool.contact-wx .operation-area i, .operation-tool.contact-wx p {
  color: #69b813;
  border-color: #69b813;
}

.operation-tool .operation-area {
  width: 98px;
  height: 98px;
  background: #fff;
  border: 1px solid #f80;
  border-radius: 6px;
  margin-bottom: 10px;
  transition: .2s;
}

.operation-tool.contact-wx .operation-area:hover, .operation-tool.contact-wx .operation-area:hover i {
  background: #69b813;
  color: #fff;
}

.icon-waiyin-weixin:before {
  content: "\e653";
}

.operation-tool p {
  font-size: 14px;
  color: #f80;
}

.hide {
  display: none;
}

.login-area_ways, .regist-area_ways {
  height: 30px;
  margin-bottom: 20px;
}

.login-area_ways span.active, .regist-area_ways span.active {
  color: #2caeff;
  border-color: #2caeff;
  padding: 0;
}

.login-area_ways span:nth-of-type(1), .regist-area_ways span:nth-of-type(1) {
  margin-left: 65px;
}

.login-area_ways span:nth-of-type(2), .regist-area_ways span:nth-of-type(2) {
  float: right;
  margin-right: 65px;
}

.login-area_ways span, .regist-area_ways span {
  line-height: 28px;
  border-bottom: 2px solid #fff;
  font-size: 14px;
  color: #999;
  float: left;
  cursor: pointer;
}

body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre, form, input, textarea, p, th, td {
  padding: 0;
  margin: 0;
}

.login-area_content {
  padding: 0 5px;
}

.login-area_item input, .regist-area_item input {
  display: block;
  width: 100%;
  height: 40px;
  border: 1px solid #d8d8d8;
  border-radius: 6px;
  box-sizing: border-box;
  margin: 5px 0;
  line-height: 40px;
  font-size: 14px;
  padding: 0 12px;
  color: #333;
  position: relative;
  z-index: 2;
}

form, input, textarea {
  font-family: "微软雅黑", Microsoft YaHei, Arial, Verdana;
  outline: none;
}

.login-area_item div, .regist-area_item div {
  overflow: hidden;
}

.login-area_item div, .regist-area_item div {
}


.error-phone, .error-passwd, .error-verify {
  opacity: 0;
}

.error-passwd, .error-phone, .error-verify, .fd-tips {
  margin-bottom: 10px;
  display: none;
  color: #666;
  font-size: 12px;
  margin-bottom: 0;
}

input[type="number"] {
  -moz-appearance: textfield;
  outline: none;

}

input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
  -webkit-appearance: none;
  appearance: none;
  margin: 0;
}

form {
  position: relative;
  font-family: "微软雅黑", Microsoft YaHei, Arial, Verdana;
  outline: none;
  padding: 0;
  margin: 0;
  display: block;
}

.login-area_item div button.disabled, .regist-area_item div button.disabled {
  color: #999;
  background: #f2f2f2;
  border: 1px solid #d8d8d8;
  cursor: not-allowed;
}

.icon-jiantouxiao-zuo:before {
  content: "\e628";
}

.login-area_item div.code button, .regist-area_item div.code button {
  margin: 5px 0;
}

.login-area_item div button, .regist-area_item div button {
  width: 120px;
  height: 42px;
  border-radius: 6px;
  float: right;
  font-size: 14px;
  cursor: pointer;
  outline: 0;
  background: #d7edff;
  border: 1px solid #a8d7ff;
  border-radius: 6px;
  color: #2caeff;
}

.login-area_item>button:hover, .regist-area_item>button:hover {
  background: #1395e7;
}

button {
  appearance: button;
  -webkit-writing-mode: horizontal-tb !important;
  text-rendering: auto;
  color: -internal-light-dark(buttontext, rgb(170, 170, 170));
  letter-spacing: normal;
  word-spacing: normal;
  text-transform: none;
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  text-align: center;
  align-items: flex-start;
  cursor: default;
  background-color: -internal-light-dark(rgb(239, 239, 239), rgb(74, 74, 74));
  box-sizing: border-box;
  margin: 0em;
  font: 400 13.3333px Arial;
  padding: 1px 6px;
  border-width: 2px;
  border-style: outset;
  border-color: -internal-light-dark(rgb(118, 118, 118), rgb(195, 195, 195));
  border-image: initial;
}

.login-area_item div, .regist-area_item div {
  overflow: hidden;
}

.error-verify {
  display: none;
  clear: both;
  margin-top: -6px;
}


.login-area_item div.code input, .regist-area_item div.code input {
  width: 220px;
  float: left;
}


.error-passwd, .error-phone, .error-verify, .fd-tips {
  margin-bottom: 10px;
  display: none;
  color: #666;
  font-size: 12px;
  margin-bottom: 0;
}

.login-area_item>button, .regist-area_item>button {
  width: 100%;
  height: 42px;
  display: block;
  background: #2caeff;
  border-radius: 21px;
  font-size: 18px;
  color: #fff;
  border: 0;
  margin-top: 30px;
  outline: 0;
  cursor: pointer;
}

.js-phone-login-btn, .js-account-login-btn, .js-phone-regist-btn {
  width: 360px !important;
  position: absolute;
  bottom: 90px;
  margin: 0;
}

button {
  appearance: button;
  -webkit-writing-mode: horizontal-tb !important;
  text-rendering: auto;
  color: -internal-light-dark(buttontext, rgb(170, 170, 170));
  letter-spacing: normal;
  word-spacing: normal;
  text-transform: none;
  text-indent: 0px;
  text-shadow: none;
  display: inline-block;
  text-align: center;
  align-items: flex-start;
  cursor: default;
  background-color: -internal-light-dark(rgb(239, 239, 239), rgb(74, 74, 74));
  box-sizing: border-box;
  margin: 0em;
  font: 400 13.3333px Arial;
  padding: 1px 6px;
  border-width: 2px;
  border-style: outset;
  border-color: -internal-light-dark(rgb(118, 118, 118), rgb(195, 195, 195));
  border-image: initial;
}

.bottom-control {
  position: absolute;
  bottom: 17px;
  right: 30px;
  height: 17px;
  line-height: 17px;
}

.bottom-control p {
  font-size: 12px;
  color: #999;
  line-height: 17px;
}

.bottom-control p a, .bottom-control p span, .regist-text-tips a {
  color: #2caeff;
  user-select: none;
  cursor: pointer;
}

.go-login_qqwx, .go-regist_qqwx {
  position: absolute;
  right: 255px;
  width: 100px;
  bottom: 0;
  cursor: pointer;
  user-select: none;
}

.bottom-control p .iconfont {
  vertical-align: -2px;
}

.regist-text-tips {
  width: 100%;
  font-size: 10px;
  color: #999;
  text-align: center;
  position: absolute;
  left: 0;
  bottom: 63px;
}

#new-login-mask {
  width: 100%;
  height: 100%;
  display: none;
  background-color: rgba(0, 0, 0, .5);
  position: fixed;
  left: 0;
  top: 0;
  z-index: 1001;
}

.weixin-login-wrap {
  width: 400px;
  height: 450px;
  display: none;
  background-color: rgb(51, 51, 51);
  position: fixed;
  margin: -250px 0 0 -250px;
  padding: 50px 0 0 100px;
  left: 50%;
  top: 50%;
  z-index: 9998;
  box-shadow: 0 2px 10px 0 rgba(0,0,0,.3);
}

.weixin-login-title {
  width: 500px;
  height: 30px;
  background-color: #dee1e6;
  position: absolute;
  left: 0;
  top: 0;
}

.weixin-login-wrap .close-newcomer {
  width: 50px;
  height: 30px;
  font-size: 12px;
  line-height: 30px;
  color: #000;
  text-align: center;
  position: absolute;
  top: 0;
  right: 0;
}

.login-area_item a, .regist-area_item a {
  line-height: 17px;
  text-align: right;
  display: block;
  height: 0;
}

</style>