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
                <el-carousel :interval="4000"  style="width: 100%; " height="580px" >
                    <el-carousel-item v-for="item in imagebox" :key="item.id">
                        <img :src="item.src" class="image" style="width: 100%; height:580px;">
                    </el-carousel-item>
                </el-carousel>
            </el-main>

            <br>
            <el-main style="line-height: inherit">
                <el-divider content-position="left">镇店之宝</el-divider>
                <el-row style="width:100%;margin: auto;">
                    <el-col :span="4" v-for="(o, index) in 5" :key="o" :offset="index > 0 ? 1 : 0">
                        <el-card :body-style="{ padding: '0px' }">
                            <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image" style="height:200px;">
                            <div style="padding: 14px;">
                                <span>好吃的汉堡</span>
                                <div class="bottom clearfix">
                                    <time class="time" style="overflow: hidden;white-space: nowrap;text-overflow: ellipsis;">{{ currentDate }}</time>
                                    <el-button type="text" class="button" style="float: right">下载</el-button>
                                    <el-button type="text" class="button" style="float: left">分享</el-button>
                                </div>
                            </div>
                        </el-card>
                    </el-col>
                </el-row>

                <br>
                <br>
                <el-divider content-position="left">红袖添香</el-divider>
                <el-row style="width:100%;margin: auto;">
                    <el-col :span="4" v-for="(o, index) in 5" :key="o" :offset="index > 0 ? 1 : 0">
                        <el-card :body-style="{ padding: '0px' }">
                            <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image" style="height:200px;">
                            <div style="padding: 14px;">
                                <span>好吃的汉堡</span>
                                <div class="bottom clearfix">
                                    <time class="time" style="overflow: hidden;white-space: nowrap;text-overflow: ellipsis;">{{ currentDate }}</time>
                                    <el-button type="text" class="button" style="float: right">下载</el-button>
                                    <el-button type="text" class="button" style="float: left">分享</el-button>
                                </div>
                            </div>
                        </el-card>
                    </el-col>
                </el-row>

                <br>
                <br>
                <el-divider content-position="left">国色仙香</el-divider>
                <el-row style="width:100%;margin: auto;">
                    <el-col :span="4" v-for="(o, index) in 5" :key="o" :offset="index > 0 ? 1 : 0">
                        <el-card :body-style="{ padding: '0px' }">
                            <img src="https://shadow.elemecdn.com/app/element/hamburger.9cf7b091-55e9-11e9-a976-7f4d0b07eef6.png" class="image" style="height:200px;">
                            <div style="padding: 14px;">
                                <span>好吃的汉堡</span>
                                <div class="bottom clearfix">
                                    <time class="time" style="overflow: hidden;white-space: nowrap;text-overflow: ellipsis;">{{ currentDate }}</time>
                                    <el-button type="text" class="button" style="float: right">下载</el-button>
                                    <el-button type="text" class="button" style="float: left">分享</el-button>
                                </div>
                            </div>
                        </el-card>
                    </el-col>
                </el-row>
            </el-main>
            <el-footer>Footer</el-footer>
        </el-container>
    </div>

</template>
<style>
    .el-header, .el-footer {
        background-color: #fff;
        color: #333;
        text-align: center;
        line-height: 60px;
    }

    .el-menu {
        background-color: #409EFF important;
    }

    .el-aside {
        background-color: #D3DCE6;
        color: #333;
        text-align: center;
        line-height: 200px;
    }

    .el-main {
        background-color: #fff;
        color: #333;
        text-align: center;
        line-height: 160px;
    }

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

    /* 跑马灯*/
    .el-carousel__item h3 {
        color: #475669;
        font-size: 14px;
        opacity: 0.75;
        line-height: 580px;
        margin: 0;
    }

    .el-carousel__item:nth-child(2n) {
        background-color: #99a9bf;
    }

    .el-carousel__item:nth-child(2n+1) {
        background-color: #d3dce6;
    }

    /*卡片*/
    .time {
        font-size: 13px;
        color: #999;
    }

    .bottom {
        margin-top: 13px;
        line-height: 12px;
    }

    .button {
        padding: 0;
        float: right;
    }

    .image {
        width: 100%;
        display: block;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }

    /*route下划线*/
    a {
        text-decoration: none;
    }

    .router-link-active {
        text-decoration: none;
    }
</style>
<script>
    export default {
        name: "Index",
        data() {
            return {
                activeIndex: '1',
                imagebox: [
                    {id:0, src:require('../assets/imagebox/1.jpg')},
                    {id:1, src:require('../assets/imagebox/2.jpg')},
                    {id:2, src:require('../assets/imagebox/3.jpg')},
                    {id:3, src:require('../assets/imagebox/4.jpg')},
                    {id:4, src:require('../assets/imagebox/5.jpg')}
                    //imagebox是assets下一个放图片的文件夹
                ],
                currentDate: '好似脚下尸横遍野，突自对镜试装。。。。。。。'
            };
        },
        methods: {
            handleSelect(key, keyPath) {
                console.log(key, keyPath);
            }
        }
    }
</script>