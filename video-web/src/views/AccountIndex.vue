<template>
  <div class="container">
    <Affix style="z-index: 9999999">
      <AccountHeader></AccountHeader>
    </Affix>
    <el-row :gutter="20" style="width:1260px; margin: 0 auto;margin-top:85px;z-index: 10">
      <el-col :span="6">
        <el-card class="box-card" style="min-height: 100vh;">
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
        <el-card class="box-card" style="min-height: 100vh;">

        </el-card>
      </el-col>
    </el-row>
  </div>

</template>

<script>
import Affix from '../components/Affix';
import AccountHeader from '../components/AccountHeader';
export default {
  name: "AccountIndex",
  components: {
    Affix: Affix,
    AccountHeader: AccountHeader,
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
      }
    };
  },
  methods: {
    handleNodeClick(data) {
      console.log(data);
    }
  }
}
</script>

<style scoped>
.container {
  width: 100%;
  min-height: 100vh;
  background: rgb(202 204 207);
}

</style>

<style>

.el-tree .el-tree-node {
  white-space: nowrap;
  outline: 0;
  margin-bottom: 8px;
  margin-top: 8px;
}
</style>