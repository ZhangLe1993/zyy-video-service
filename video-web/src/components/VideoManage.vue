<template>
  <el-card class="box-card" style="height: calc(100% - 9px);">
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
    <div class="infinite-list-wrapper" style="overflow:auto;height: calc(100vh - 140px);background: #f4f5f5;">
      <ul
          class="list"
          v-infinite-scroll="load"
          infinite-scroll-disabled="disabled">
        <!-- 视频列表 -->
        <li v-for="i in count" class="list-item" :key="i">
          <div style="width:150px;height:200px;display:block;float: left">
            <el-image :src="src">
              <div slot="placeholder" class="image-slot">
                加载中<span class="dot">...</span>
              </div>
            </el-image>
            <span class="badge-top--3o4Be">置顶</span>
          </div>
          <div style="width: calc(100% - 160px); height: 200px; display: block; float: right; ">
            <div style="text-align: left;color:rgba(22,24,35,0.5);">
              <span>视频描述</span>
            </div>
            <div style="text-align: left;color:rgba(22,24,35,0.5);line-height: 50px">
              <span><i class="el-icon-view"> </i></span> 0
              &nbsp;&nbsp;&nbsp;
              <span><i class="el-icon-chat-dot-round"> </i></span> 0
              &nbsp;&nbsp;&nbsp;
              <span><i class="iconfont icon-videoxinaixin"> </i></span> 0
            </div>
            <div style="text-align: left;color:rgba(22,24,35,0.5);">
              <span style="color:rgb(57, 181, 74);">已发布</span>
              &nbsp;&nbsp;&nbsp;
              <span>2021年07月05日 21:06</span>
            </div>
            <!-- 操作按钮 -->
            <div class="op-btns--DxbEz">
              <div class="ghost-btn--10MXQ op-btn--lDoCH" style="color: rgb(119, 120, 123);" @click="openUpdateDescDialog(i)">
                <svg width="16" height="16" viewBox="0 0 16 16" fill="none">
                  <path
                      d="M9.667 3L13 6.333l1.39-1.39c.521-.521.521-1.365 0-1.886l-1.447-1.448a1.333 1.333 0 00-1.886 0L9.667 3zM1.498 14.09l1.121-3.924a.667.667 0 01.17-.288L8.667 4 12 7.333l-5.878 5.878a.667.667 0 01-.288.17L1.91 14.5a.333.333 0 01-.412-.411z"
                      fill="#1C1F23" fill-opacity="0.6"></path>
                </svg>
                <span>修改描述</span></div>
              <div class="ghost-btn--10MXQ op-btn--lDoCH" style="color: rgb(119, 120, 123);" @click="openSetAuthDialog(i)">
                <svg width="16" height="16" viewBox="0 0 16 16" fill="none">
                  <path fill-rule="evenodd" clip-rule="evenodd"
                        d="M6 2a2 2 0 00-2 2v2a2 2 0 00-2 2v5a2 2 0 002 2h8a2 2 0 002-2V8a2 2 0 00-2-2V4a2 2 0 00-2-2H6zm2.5 6h-1a.5.5 0 00-.5.5V12a.5.5 0 00.5.5h1A.5.5 0 009 12V8.5a.5.5 0 00-.5-.5zM10 6V4H6v2h4z"
                        fill="#1C1F23" fill-opacity="0.6"></path>
                </svg>
                <span>设置权限</span></div>
              <div class="ghost-btn--10MXQ op-btn--lDoCH" style="color: rgb(119, 120, 123);" @click="toTop(i)">
                <svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
                  <g opacity="0.6">
                    <path d="M11.5858 9L8 5.41421L4.41421 9L11.5858 9Z" fill="#1C1F23" stroke="#1C1F23" stroke-width="2"
                          stroke-linecap="round" stroke-linejoin="round"></path>
                    <path
                        d="M10 15.5C10 15.7761 9.77614 16 9.5 16L6.5 16C6.22386 16 6 15.7761 6 15.5L6 10L10 10L10 15.5Z"
                        fill="#1C1F23"></path>
                    <rect x="1" y="1" width="14" height="2" rx="0.5" fill="#1C1F23"></rect>
                  </g>
                </svg>
                <span>作品置顶</span></div>
              <div class="ghost-btn--10MXQ op-btn--lDoCH" style="color: rgb(254, 44, 85);" @click="openDeleteConfirmDialog(i)">
                <svg width="16" height="16" viewBox="0 0 16 16" fill="none">
                  <path fill-rule="evenodd" clip-rule="evenodd"
                        d="M2.5 2a.5.5 0 00-.5.5v1a.5.5 0 00.5.5h11a.5.5 0 00.5-.5v-1a.5.5 0 00-.5-.5h-11zM13 6v7a2 2 0 01-2 2H5a2 2 0 01-2-2V6a.5.5 0 01.5-.5h9a.5.5 0 01.5.5z"
                        fill="#FE2C55"></path>
                  <path d="M6 1a.5.5 0 01.5-.5h3a.5.5 0 01.5.5v1.5H6V1z" fill="#FE2C55"></path>
                </svg>
                <span>删除作品</span></div>
            </div>
          </div>
        </li>
      </ul>
      <p v-if="loading"><i class="el-icon-loading"> </i> 加载中...</p>
      <p v-if="noMore">没有更多视频了</p>

    </div>

    <el-dialog title="修改作品描述" :visible.sync="updateDescDialogFormVisible" width="471px">
      <el-form :model="descForm">
        <el-input
            style="background:rgb(244, 245, 245);"
            :autosize="{ minRows: 4, maxRows: 4}"
            resize="none"
            type="textarea"
            placeholder=""
            v-model="descForm.videoDesc"
            maxlength="500"
            show-word-limit
        >
        </el-input>
        <div class="huati-div">
          <span class="huati"># <span style="font-weight: bold;">添加话题</span></span>
          &nbsp;&nbsp;&nbsp;&nbsp;
          <span class="huati">@ <span style="font-weight: bold;">好友</span></span>
        </div>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="huise" @click="updateDescDialogFormVisible = false">取 消</el-button>
        <el-button type="xianh" @click="submitUpdateDesc()">修 改</el-button>
      </div>
    </el-dialog>

    <el-dialog title="权限设置" :visible.sync="authDialogFormVisible" width="471px">
      <div class="video-card-simple--1PhsM">
        <img class="card-cover--3wQnN" src="https://p11.douyinpic.com/img/tos-cn-p-0015/c285a2df989c456ba8903f6cb7976078_1625310205~c5_300x400.jpeg?from=4257465056_large">
        <p class="card-info--19Us-">累死 #人山人海 </p>
      </div>
      <el-form :model="authForm" style="text-align: left">
        <div class="auth-item-title">谁可以看</div>
        <div class="radio-space">
          <el-radio-group
              :fill='fill'
              :text-color="textColor"
              v-model="authForm.shareRange">
            <el-radio label="public">公开</el-radio>
            <el-radio label="protected">好友可见</el-radio>
            <el-radio label="private">仅自己可见</el-radio>
          </el-radio-group>
        </div>

        <div class="auth-item-title">允许他人保存视频</div>

        <div class="radio-space">
          <el-radio-group v-model="authForm.allowDownload">
            <el-radio label="allow">允许</el-radio>
            <el-radio label="notAllow">不允许</el-radio>
          </el-radio-group>
        </div>

      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="huise" @click="authDialogFormVisible = false">取 消</el-button>
        <el-button type="xianh" @click="submitSetAuth()">保 存</el-button>
      </div>
    </el-dialog>

    <el-dialog :visible.sync="deleteVideoDialogFormVisible" width="471px">
      <template v-slot:title>
        <div style="float: left; width: 24px; height: 24px;">
          <svg width="24" height="24" viewBox="0 0 24 24" fill="none">
            <path fill-rule="evenodd" clip-rule="evenodd"
                  d="M10.227 2.399l-8.7 16.676C.83 20.406 1.796 22 3.298 22h17.402c1.502 0 2.468-1.594 1.773-2.925l-8.7-16.676c-.749-1.434-2.8-1.434-3.547 0zm2.915 11.611a1.153 1.153 0 01-2.283 0l-.576-4.03a1.735 1.735 0 113.434 0l-.575 4.03zm.358 4.49a1.5 1.5 0 11-3 0 1.5 1.5 0 013 0z"
                  fill="#FC8800">
            </path>
          </svg>
        </div>
        <div class="title-word">
          确定要移除此作品吗
        </div>
      </template>
      <div slot="footer" class="dialog-footer">
        <el-button type="huise" @click="deleteVideoDialogFormVisible = false">取 消</el-button>
        <el-button type="xianh" @click="submitDeleteVideo()">确 定</el-button>
      </div>
    </el-dialog>

  </el-card>
</template>

<script>
export default {
  name: "VideoManage",
  data() {
    return {
      count: 4,
      loading: false,
      src: 'https://p9.douyinpic.com/img/tos-cn-p-0015/33f3631acb624724abcfe62e149335c9~c5_300x400.jpeg?from=4257465056_large',
      textarea: '',
      descForm: { vid: '', videoDesc: ''},
      authForm: { vid: '', shareRange: 'public', allowDownload: 'allow' },
      deleteForm: { vid: '' },
      updateDescDialogFormVisible: false,
      authDialogFormVisible: false,
      deleteVideoDialogFormVisible: false,
      fill: "#fe2c55",
      textColor: "#000",
    }
  },
  computed: {
    noMore () {
      return this.count >= 20
    },
    disabled () {
      return this.loading || this.noMore
    }
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
    },
    openUpdateDescDialog(vid) {
      console.log('打开修改描述弹出层');
      console.log(vid);
      this.updateDescDialogFormVisible = true;
      this.descForm.vid = vid;
    },
    openSetAuthDialog(vid) {
      console.log('打开设置权限弹出层');
      console.log(vid);
      this.authDialogFormVisible = true;
      this.authForm.vid = vid;
    },
    openDeleteConfirmDialog(vid) {
      console.log('打开删除作品弹出层');
      console.log(vid);
      this.deleteVideoDialogFormVisible = true;
      this.deleteForm.vid = vid;
    },
    submitUpdateDesc() {
      console.log("提交数据:" + JSON.stringify(this.descForm));
    },
    submitSetAuth() {
      console.log("提交数据:" + JSON.stringify(this.authForm));
    },
    submitDeleteVideo() {
      console.log("提交数据:" + JSON.stringify(this.deleteForm));
    },
    toTop(vid) {
      console.log('作品置顶');
      console.log(vid);
      // 刷新列表
    }
  }
}
</script>

<style scoped>

.el-image {
  border-radius: 8px;
}
.list{
  padding-left: 5px;
  padding-right: 20px;
}
.list-item {
  list-style-type:none;
  display: block;
  width: 100%;
  height: 210px;
  padding-top: 10px;
  padding-bottom: 2px;
  padding-left: 10px;
  background: #fff;
  margin-bottom: 10px;
  margin-left: 5px;
}

.list-item:hover {
 background: #eee;
}

.list-item .op-btns--DxbEz {
  margin-top: 90px;
  text-align: left;
  visibility: hidden;
  font-weight: bold;
  opacity: 0;
  transition: all .15s ease-in;
}

.list-item:hover .op-btns--DxbEz {
  visibility: visible;
  opacity: 1;
}

.list-item .op-btns--DxbEz .op-btn--lDoCH {
  padding-right: 12px;
  margin-right: 20px;
  display: flex;
  justify-content: center;
  align-items: center;
  cursor: pointer;
  display: inline-flex;
}

.huati {
  background: rgb(244, 245, 245);
  display: inline-block;
  padding-top: 2px;
  padding-bottom: 2px;
  padding-left: 13px;
  padding-right: 13px;
  border-radius: 3px;
}
.huati-div {
  text-align: left;
  margin-top: 10px;
}

.auth-item-title {
  font-size: 14px;
  color: #161823;
  font-weight: 600;
  margin: 8px 0 0;
}

.radio-space {
  padding: 10px;
  font-weight: bold;
}

.video-card-simple--1PhsM {
  /*width: 100%;*/
  /*height: 96px;*/
  background-color: rgba(46,50,56,0.05);
  padding: 12px;
  display: flex;
}

.video-card-simple--1PhsM .card-cover--3wQnN {
  width: 54px;
  height: 72px;
  border-radius: 2px;
  -o-object-fit: cover;
  object-fit: cover;
}

.video-card-simple--1PhsM .card-info--19Us- {
  font-size: 14px;
  overflow: hidden;
  text-overflow: ellipsis;
  word-break: break-all;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
  color: #161823;
  margin-left: 12px;
  line-height: 1.71;
}

.title-word {
  line-height: 28px;
  width: calc(100% - 40px);
  float: right;
}

.badge-top--3o4Be {
  position: relative;
  /* width: calc(100% - 10px); */
  display: flex;
  z-index: 1;
  justify-content: center;
  align-items: center;
  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEoAAAAlBAMAAAAXXGLNAAAAJFBMVEVHcEz6zhX6zhT6zhX6zhX3yxT6zhX6zxT/zxD3zxT5zhT6zhXUrnWRAAAAC3RSTlMA77qA2zSbXRAgbySxF7sAAACqSURBVDjLrdSxDcIwEAXQK0AKbSQK5BFoMgZ0LhiAESzaNCkyAEUmoKUyIFP85SJhJ53PH8m/fvqFfXcizcMgk9bJkgvyCUNCO6MonJLaaAghqV5VuEZ1BFNmdIXupwoIb0rFMlBlRQVHqS+lYCm1p5S3jMKBUi9K+YoqUOrMqM+92qt6W++3Xb0p7Pjt4DaN29ondQHGwmTFbKnLJJNWNazH8JZFrZV/MgMbmmVtSGh3kQAAAABJRU5ErkJggg==);
  top: -200px;
  left: -4px;
  height: 18px;
  width: 40px;
  background-size: contain;
  background-repeat: no-repeat;
  background-position: center;
  padding: 0 9px 0 4px;
  font-size: 11px;
  line-height: 1;
  color: #161823;
}
</style>

<style>

.el-dialog__header {
  padding: 20px 20px 10px;
  text-align: left;
  font-style: normal;
  font-weight: 600;
  font-size: 16px;
  line-height: 24px;
  color: #161823;
}

/* 增加 element-UI按钮样式 */
.el-button--xianh {
  color: #fff !important;
  background-color: #fe2c55 !important;
  border-color: #fe2c55 !important;
}
.el-button--xianh:hover{
  background-color: #fe2c90 !important;
  border-color: #fe2c90 !important;
}
.el-button--xianh:focus{
  background-color: #fe2c90 !important;
  border-color: #fe2c90 !important;
}

.el-button--huise {
  color: #000 !important;
  background-color: rgb(244, 245, 245) !important;
  border-color: rgb(244, 245, 245) !important;
}
.el-button--huise:hover{
  background-color: rgb(244, 245, 245) !important;
  border-color: rgb(244, 245, 245) !important;
}
.el-button--huise:focus{
  background-color: rgb(244, 245, 245) !important;
  border-color: rgb(244, 245, 245) !important;
}

/* 更改element-UI radio 样式 */
.el-radio__input.is-checked + .el-radio__label {
  color: #fe2c55 !important;
}

.el-radio__input.is-checked .el-radio__inner {
  background: #fe2c55 !important;
  border-color: #fe2c55 !important;
}

.el-radio {
  font-weight: bold;
}

.el-radio__label {
  font-weight: bold;
}
</style>