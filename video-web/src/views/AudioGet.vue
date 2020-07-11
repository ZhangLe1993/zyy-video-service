<template>
    <div>
        <el-container>
            <el-header>
                <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
                    <el-menu-item index="1" ><router-link to="/index" :underline="false" >首页</router-link></el-menu-item>
                    <el-menu-item index="2" ><router-link to="/audio/extract" :underline="false" >音频提取</router-link></el-menu-item>
                    <el-menu-item index="3" >音频合并</el-menu-item>
                    <el-menu-item index="4" >视频转码</el-menu-item>
                    <el-menu-item index="5" >视频提取</el-menu-item>
                </el-menu>
            </el-header>
            <el-main>
                <div style="margin-top: 15px;">
                    <el-input placeholder="请输入链接" v-model="input" class="input-with-select">
                        <el-select v-model="select" slot="prepend" placeholder="请选择提取类型">
                            <el-option label="从链接提取" value="2"></el-option>
                        </el-select>
                        <el-button slot="append" icon="el-icon-search"></el-button>
                    </el-input>
                </div>
            </el-main>
        </el-container>
        <el-divider content-position="left">试听</el-divider>
        <div>
            <AudioPlayer :audio-list="audioList" :before-play="onBeforePlay" />
        </div>
    </div>

</template>
<style>
    body > .el-container {
        margin-bottom: 40px;
    }

    .el-container:nth-child(5) .el-aside,
    .el-container:nth-child(6) .el-aside {
        line-height: 260px;
    }

    .el-container:nth-child(7) .el-aside {
        line-height: 320px;
    }

    /*route下划线*/
    a {
        text-decoration: none;
    }

    .router-link-active {
        text-decoration: none;
    }

    /*输入框*/
    .el-select .el-input {
        width: 130px;
    }
    .input-with-select .el-input-group__prepend {
        background-color: #fff;
    }

    /* 卡片 */
    .box-card {
        width: 100px;
        margin: auto;
    }
</style>

<script>
    import '@liripeng/vue-audio-player/lib/vue-audio-player.css'
    export default {
        name: "AudioGet",
        data() {
            return {
                activeIndex: '2',
                input: '',
                select: '',
                playerOptions: {
                    playbackRates: [0.7, 1.0, 1.5, 2.0], //播放速度
                    autoplay: false, //如果true,浏览器准备好时开始回放。
                    muted: false, // 默认情况下将会消除任何音频。
                    loop: false, // 导致视频一结束就重新开始。
                    preload: 'auto', // 建议浏览器在<video>加载元素后是否应该开始下载视频数据。auto浏览器选择最佳行为,立即开始加载视频（如果浏览器支持）
                    language: 'zh-CN',
                    aspectRatio: '16:9', // 将播放器置于流畅模式，并在计算播放器的动态大小时使用该值。值应该代表一个比例 - 用冒号分隔的两个数字（例如"16:9"或"4:3"）
                    fluid: true, // 当true时，Video.js player将拥有流体大小。换句话说，它将按比例缩放以适应其容器。
                    sources: [{
                        type: "",
                        src: "../../static/image/test.mp4" //视频url地址
                    }],
                    poster: "../../static/image/thumb_1_1380_460_20181009043014983386.jpg", //你的封面地址
                    // width: document.documentElement.clientWidth,
                    notSupportedMessage: '此视频暂无法播放，请稍后再试', //允许覆盖Video.js无法播放媒体源时显示的默认信息。
                    controlBar: {
                        timeDivider: true,
                        durationDisplay: true,
                        remainingTimeDisplay: false,
                        fullscreenToggle: true  //全屏按钮
                    }
                },
                tags: [
                    { name: '标签一', type: '' },
                    { name: '标签二', type: 'success' },
                    { name: '标签三', type: 'info' },
                    { name: '标签四', type: 'warning' },
                    { name: '标签五', type: 'danger' }
                ],
                audioList: [
                    'https://m10.music.126.net/20200625230323/00bf30efe8f10e79fd18e96e71c7dfe1/yyaac/535f/0608/545f/d5be97a91a1b609062a8c5deaad25a8a.m4a',
                    'https://m10.music.126.net/20200625230323/00bf30efe8f10e79fd18e96e71c7dfe1/yyaac/535f/0608/545f/d5be97a91a1b609062a8c5deaad25a8a.m4a'
                ]
            };
        },
        methods: {
            // 播放前做的事
            onBeforePlay(next) {
                console.log('这里可以做一些事情...')
                next() // 开始播放
            },
            // 音频链接解析
            audioParse(type, input) {
                this.$api.post('/zyy/audio/parse', { type: type, input: input }, (res) => {
                    console.log(res);
                    if (res.status >= 200 && res.status < 300) {
                        console.log(res.data);
                    } else {
                        console.log(res.message);
                    }
                })
            },
        }
    }
</script>

<style scoped>

</style>