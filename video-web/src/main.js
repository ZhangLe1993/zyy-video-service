import Vue from 'vue'
import App from './App.vue'
import router from './router'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

/* 播放器 */
import VueVideoPlayer from 'vue-video-player'
import 'video.js/dist/video-js.css'

/* 音频播放器 */
import AudioPlayer from '@liripeng/vue-audio-player'
import '@liripeng/vue-audio-player/lib/vue-audio-player.css'

/* axios Ajax请求*/
import Api from './service/service.js';
Vue.prototype.$api = Api;

/* cnpm install crypto-js --save */
/* import CryptoJS from 'crypto-js'; */

Vue.config.productionTip = false

/* elementUI */
Vue.use(ElementUI);

/* 播放器 */
Vue.use(VueVideoPlayer)

Vue.use(AudioPlayer)

router.beforeEach((to, from, next) => {
  if(to.meta.title) {

    document.title = to.meta.title;
  }

  next();
});

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
