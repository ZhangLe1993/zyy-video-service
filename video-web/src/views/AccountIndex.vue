<template style="overflow: hidden;"><!--style="overflow: hidden;"-->
  <div class="body-bg">
    <div class="container">
      <Affix style="box-shadow:2px 2px 5px #f4f5f5;height: 80px;">
        <AccountHeader></AccountHeader>
      </Affix>
      <div style="overflow: auto;height: calc(100vh);">
        <el-row :gutter="20" style="width:1260px; margin: 0 auto;margin-top:20px;height: calc(100%);">
          <el-col :span="6" style="height: calc(100% - 9px);">
            <el-card class="box-card" style="height: calc(100%);">
              <el-button type="danger" style="width: 100%;"> 上传视频</el-button>
              <el-divider></el-divider>
              <el-tree
                  style="padding-bottom: 10px;"
                  :data="data"
                  :props="defaultProps"
                  :highlight-current="highlight"
                  :default-expand-all="expand"
                  node-key="label"
                  current-node-key="首页"
                  @node-click="handleNodeClick">

                <span class="custom-tree-node" slot-scope="{ node, data }">
                  <span :style="data.style">
                      <i :class="data.icon"> </i> {{ node.label }}
                  </span>
                </span>
              </el-tree>
            </el-card>
          </el-col>

          <el-col :span="18" style="height: calc(100%);">
            <!-- 个人主页 -->
            <div v-if="visible.homePage" style="height: calc(100%);">
              <HomePage />
            </div>
            <div v-if="visible.videoManage" style="height: calc(100%);">
              <!-- 视频管理 -->
              <VideoManage />
            </div>
            <div v-if="visible.followManage" style="height: calc(100%);">
              <!-- 关注管理 -->
              <FollowManage />
            </div>
          </el-col>

        </el-row>


        <div style="height:280px">
          <Footer></Footer>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
import Affix from '../components/Affix';
import AccountHeader from '../components/AccountHeader';
import Footer from '../components/Footer';
import HomePage from "@/components/HomePage";
import VideoManage from "@/components/VideoManage";
import FollowManage from "@/components/FollowManage";
export default {
  name: "AccountIndex",
  components: {
    Affix: Affix,
    AccountHeader: AccountHeader,
    Footer: Footer,
    HomePage: HomePage,
    VideoManage: VideoManage,
    FollowManage: FollowManage,
  },
  data() {
    return {
      expand: true,
      highlight: true,
      data: [{
        style: 'font-weight: 700;font-size: 14px;',
        icon: 'el-icon-s-home',
        label: '首页',
        func: 'homePage',
      },{
        style: 'font-weight: 700;font-size: 14px;',
        icon: 'el-icon-menu',
        label: '内容管理',
        children: [{
          icon: '',
          style: '',
          label: '视频管理',
          func: 'videoManage',
        }]
      }, {
        style: 'font-weight: 700; font-size: 14px;',
        icon: 'el-icon-s-promotion',
        label: '互动管理',
        children: [{
          style: '',
          label: '关注管理',
          func: 'followManage',
        }, {
          style: '',
          label: '粉丝管理',
        }, {
          style: '',
          label: '评论管理',
        }, {
          style: '',
          label: '私信管理',
        }]
      }, {
        style: 'font-weight: 700; font-size: 14px;',
        icon: 'el-icon-pie-chart',
        label: '视频数据',
        children: [{
          label: '数据总览',

        }, {
          label: '作品数据',

        }, {
          label: '粉丝画像',
        }]
      }, {
        style: 'font-weight: 700; font-size: 14px;',
        icon: 'el-icon-document',
        label: '帮助中心',
        children: [{
          label: '功能介绍',

        }, {
          label: '联系我们',

        }, {
          label: '内容规范',
        }]
      }],
      defaultProps: {
        children: 'children',
        label: 'label'
      },
      visible: {
        homePage: true,
        videoManage: false,
        followManage: false,
        fansManage: false,
        commentManage: false,
        messageManage: false,
        Dashboard: false,
        worksAnalysis: false,
        fansPortrait: false,
        weeklyPublication: false,
        instructions: false,
        contact: false,
        contentSpecification: false,
      },
    };
  },
  mounted() {

    
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
      console.log(data['func']);
      if(data['func'] !== undefined && data['func'] !== null && data['func'] !== "") {
        const name = data.func;
        // const toUpper = name.substr(0, 1);
        // const lower = name.substr(1, name.length - 1);
        // console.log(toUpper.toUpperCase() + lower);
        const _visible = this.visible;
        Object.keys(_visible).forEach((k) => {
          if(k === name) {
            _visible[k] = true;
          } else {
            _visible[k] = false;
          }
        });
        // this.callModelFun("draw" + toUpper.toUpperCase() + lower);
      }
    },
    /**
     * 根据方法名称调用方法
     */
    callModelFun(funcName) {
      let methods = this.$options.methods;
      const _this = this;
      methods[funcName](_this);
      // this.$options.methods[funcName]()
    },
    drawVideoManage(_this) {
      console.log('渲染视频管理');
      _this.visible = { homePage: false, videoManage: true };
    },
    drawHomePage(_this) {
      console.log('渲染首页');
      _this.visible = { homePage: true, videoManage: false };
    },
  }
}
</script>

<style scoped>

.body-bg {
  position: absolute;
  height: 100%;
  width: 100%;
  top:0;
  left: 0;
  overflow: hidden;
  background-color: #f7f8f9 !important;
}

.container {
  width: 100%;
  min-height: 100vh;
  background: #f4f5f5;
  overflow: hidden;
}

.is-current >.el-tree-node__content .custom-tree-node {
  color: #fe2c55;
  font-weight: 700;
}

</style>

<style>

.el-tree .el-tree-node {
  white-space: nowrap;
  outline: 0;
  margin-bottom: 8px;
  margin-top: 8px;
}

.el-card.is-always-shadow, .el-card.is-hover-shadow:focus, .el-card.is-hover-shadow:hover {
  box-shadow: 0 0 0 0 rgba(0,0,0,.1) !important;
}

.el-card {
  border: 0 solid #EBEEF5 !important;
}

</style>