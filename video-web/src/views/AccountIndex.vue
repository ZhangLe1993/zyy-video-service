<template style="overflow: hidden;"><!--style="overflow: hidden;"-->
  <div class="body-bg">
    <div class="container">
      <Affix style="box-shadow:2px 2px 5px #f4f5f5;height: 80px;">
        <AccountHeader></AccountHeader>
      </Affix>
      <div style="overflow: auto;height: calc(100vh);">
        <el-row :gutter="20" style="width:1260px; margin: 0 auto;margin-top:20px;">
          <el-col :span="6">
            <el-card class="box-card" style="height: calc(100vh - 10px);">
              <el-button type="danger" style="width: 100%;"> 上传视频</el-button>
              <el-divider></el-divider>
              <el-tree
                  style="padding-bottom: 8px;"
                  :data="data"
                  :props="defaultProps"
                  :highlight-current="highlight"
                  :default-expand-all="expand"
                  accordion
                  @node-click="handleNodeClick">

                <span class="custom-tree-node" slot-scope="{ node, data }">
                  <span :style="data.style">
                      <i :class="data.icon"> </i> {{ node.label }}
                  </span>
                </span>
              </el-tree>
            </el-card>
          </el-col>
          <el-col :span="18">
            <el-card class="box-card" style="height: 200px;">
              <div style="width:120px;height:120px;display:block;float: left">
                <el-avatar  style="width:100%;height:100%;"  src="//thirdwx.qlogo.cn/mmopen/ibYvc6Zd00icN2A0urey20HVRAVg6QibytRJlV1BBwlKlDfz2sjnqyACib0foQjC2LBicFG1HHaicIicTQxh9vwlFhpk0PNXyL85j56/132"></el-avatar>
              </div>
              <div style="width:calc(100% - 140px);height:80px;float: right;">
                <div style="font-size: 20px;font-weight: 500;overflow: hidden;text-overflow: ellipsis;word-break: break-all;display: -webkit-box;line-height: 50px;">
                  张音乐
                </div>
                <div style="font-size: 12px;overflow: hidden;text-overflow: ellipsis;word-break: break-all;display: -webkit-box;line-height: 30px;" title="">
                  <span>3000 &nbsp;</span>
                  <div style="color:rgba(22,24,35,0.5);">获赞</div>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                  <span>500 &nbsp;</span>
                  <div style="color:rgba(22,24,35,0.5);">关注</div>
                  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                  <span>500 &nbsp;</span>
                  <div style="color:rgba(22,24,35,0.5);">粉丝</div>
                  &nbsp;&nbsp;
                  <el-divider direction="vertical"></el-divider>
                  <div style="color:rgba(22,24,35,0.5);">视频号:</div>
                  <span> &nbsp; z.music.fll</span>
                </div>
                <div style="font-size: 12px;overflow: hidden;text-overflow: ellipsis;word-break: break-all;display: -webkit-box;color:rgba(22,24,35,0.5);line-height: 30px;" title="">
                  你还没有填写个人简介&nbsp;&nbsp;
                  <i class="el-icon-edit"></i>
                </div>
              </div>
            </el-card>

            <el-card class="box-card" style="height: calc(100vh - 210px);">
              <div style="text-align: left;">
                <el-button type="danger" style="margin-right: 15px;"> 全部作品</el-button>
                <el-divider direction="vertical"></el-divider>
                <el-button type="danger" style="margin-left: 15px;margin-right: 15px;"> 已发布</el-button>
                <el-divider direction="vertical"></el-divider>
                <el-button type="danger" style="margin-left: 15px;"> 审核中</el-button>
                <el-divider direction="vertical"></el-divider>
                <el-button type="danger" style="margin-left: 15px;"> 未通过</el-button>
              </div>
              <el-divider></el-divider>
              <div class="infinite-list-wrapper" style="overflow:auto;height: calc(100vh - 420px);background: #f4f5f5;">
                <ul
                    class="list"
                    v-infinite-scroll="load"
                    infinite-scroll-disabled="disabled">
                  <li v-for="i in count" class="list-item" :key="i">{{ i }}</li>
                </ul>
                <p v-if="loading">加载中...</p>
                <p v-if="noMore">没有更多了</p>
              </div>
            </el-card>
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
export default {
  name: "AccountIndex",
  components: {
    Affix: Affix,
    AccountHeader: AccountHeader,
    Footer: Footer,
  },
  data() {
    return {
      expand: true,
      highlight: true,
      data: [{
        style: 'font-weight: 700;font-size: 14px;',
        icon: 'el-icon-s-home',
        label: '首页',
      },{
        style: 'font-weight: 700;font-size: 14px;',
        icon: 'el-icon-menu',
        label: '内容管理',
        children: [{
          icon: '',
          style: '',
          label: '视频管理',
        }]
      }, {
        style: 'font-weight: 700; font-size: 14px;',
        icon: 'el-icon-s-promotion',
        label: '互动管理',
        children: [{
          style: '',
          label: '关注管理',

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
      count: 3,
      loading: false
    };
  },
  computed: {
    noMore () {
      return this.count >= 20
    },
    disabled () {
      return this.loading || this.noMore
    }
  },
  mounted() {

    
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
    },
    load () {
      this.loading = true
      setTimeout(() => {
        this.count += 2
        this.loading = false
      }, 2000)
    }
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
  background-color: #fff;
}

.container {
  width: 100%;
  min-height: 100vh;
  background: #f4f5f5;
  overflow: hidden;
}

.list-item {
  list-style-type:none;
  display: block;
  width: 100%;
  height: 200px;
  background: #fff;
  margin-bottom: 10px;
}

</style>

<style>

/* height: calc(100vh - 85px); */
.el-tree .el-tree-node {
  white-space: nowrap;
  outline: 0;
  margin-bottom: 8px;
  margin-top: 8px;
}


</style>