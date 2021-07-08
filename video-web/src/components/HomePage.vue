<template>
  <div style="height: calc(100%);">
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
    <el-row style="height: calc(100% - 210px);">
      <el-col :span="24" style="height: calc(100%)">
        <div class="grid-content bg-purple-dark" style="height: calc(100%)">
          <el-card class="box-card" style="height: calc(100%)">
            <div slot="header" class="clearfix" style="text-align: left">
              <span>视频数据</span>
            </div>
            <el-row :gutter="20">
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>播放总量</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>主页访问数</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>视频点赞数</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
            </el-row>
            <el-row :gutter="20">
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>新增粉丝数</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>视频评论数</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
              <el-col :span="8">
                <div class="grid-content bg-purple">
                  <el-card class="box-card">
                    <div style="color:rgba(22,24,35,0.75); font-size: 12px;line-height: 17px;text-align: left;">
                      <span>视频分享数</span>
                    </div>
                    <div class="small-card-num">
                      <span>0</span>
                    </div>
                    <div class="block-change">- -</div>
                  </el-card>
                </div>
              </el-col>
            </el-row>
          </el-card>
        </div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
export default {
  name: "HomePage"
}
</script>

<style scoped>

.small-card-num {
  font-weight: 500;
  font-size: 20px;
  line-height: 24px;
  color: #161823;
  margin-top: 10px;
  text-align: left;
}

.block-change {
  font-size: 12px;
  line-height: 14px;
  margin-top: 12px;
  text-align: left;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}
.clearfix:after {
  clear: both
}
</style>