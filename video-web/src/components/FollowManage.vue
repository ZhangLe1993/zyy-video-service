<template>
  <el-card style="height: calc(100% - 9px); overflow: auto;">
    <div style="width:100%; ">
      <div class="follow-title">关注列表</div>
      <div style="width:100%;">
        <el-table
            :data="tableData"
            style="width: 100%;">
          <el-table-column
              label="头像/用户名称"
              width="300">
            <template slot-scope="scope">
              <div style="width:48px;height:48px;display:block;float: left">
                <el-avatar style="width:100%;height:100%;"  :src="scope.row.avatar"></el-avatar>
              </div>
              <span style="margin-left: 10px; line-height: 48px;">{{ scope.row.nickname }}</span>
            </template>
          </el-table-column>
          <el-table-column
              prop="signature"
              label="签名"
              width="450">
          </el-table-column>
          <el-table-column
              prop="address"
              label="操作">
            <template slot-scope="scope">
              <el-button @click="handleClick(scope.row)" type="text" size="small">取消关注</el-button>
            </template>
          </el-table-column>
        </el-table>
      </div>
      <div>
        <p class="huoshan-tip--36DM1">为尊重你的选择，因未授权向抖音同步你在抖音火山版的好友关系（包含关注等），部分用户暂不支持查看。授权后，你可以在抖音发现更多好友，并看到更多内容</p>
      </div>
      <div style="text-align: center; margin-top: 24px;">

        <i class="el-icon-arrow-left"> </i> <i class="el-icon-arrow-right"> </i>
      </div>
  </div>
  </el-card>
</template>

<script>
export default {
  name: "FollowManage",
  methods: {
    handleClick(row) {
      console.log(row);
    }
  },
  data() {
    return {
      tableData: [
        {
          avatar: '//sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/3793/3131589739~120x256.image',
          nickname: '小气',
          signature: '👉陪伴是最好的教育，↵👀父母是孩子的第一任老师，↵🧚‍♀️一起关注孩子成长，↵👍家长好好学习，孩子天天向上！↵关注我，看更多精彩内容！↵欢迎大家投稿（要有趣/有新闻性）'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/douyin-user-file/737babf28a650b2c7b5dbe276b0a48e6',
          nickname: '小白读书',
          signature: '抖音上热门唯一官方锦鲤🐬↵直播时间: 周一到周五 17:00-23:00↵发视频@DOU+小助手，每天送流量带你上热门！戳下方“点我送流量”，快速涨粉上热门！👇👇'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/26ee20001afd449207eca',
          nickname: '丽娘',
          signature: '咨询绘画学习可以点击下方的“联系我们”↵感谢大家的支持和喜爱:citongwojx↵目前开设了多种类型的绘画班：素描，彩铅，色粉，碳晶粉，水彩，丙烯，国画，等等。网课线下（南京）都招生哦。网课报名可以直接点击商家页面直接报名学习哦。'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/tos-cn-avt-0015/b6edf8ccc8a249beca41eab23fdb19fb',
          nickname: '小沐',
          signature: '➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕↵                     主页橱窗有推荐必读书↵                粉丝 / 商务：shengyedushu↵             仅此一个号，其他号都是搬运🙏↵➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕'
        },
        {
          avatar: '//sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/3793/3131589739~120x256.image',
          nickname: '小气',
          signature: '👉陪伴是最好的教育，↵👀父母是孩子的第一任老师，↵🧚‍♀️一起关注孩子成长，↵👍家长好好学习，孩子天天向上！↵关注我，看更多精彩内容！↵欢迎大家投稿（要有趣/有新闻性）'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/douyin-user-file/737babf28a650b2c7b5dbe276b0a48e6',
          nickname: '小白读书',
          signature: '抖音上热门唯一官方锦鲤🐬↵直播时间: 周一到周五 17:00-23:00↵发视频@DOU+小助手，每天送流量带你上热门！戳下方“点我送流量”，快速涨粉上热门！👇👇'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/26ee20001afd449207eca',
          nickname: '丽娘',
          signature: '咨询绘画学习可以点击下方的“联系我们”↵感谢大家的支持和喜爱:citongwojx↵目前开设了多种类型的绘画班：素描，彩铅，色粉，碳晶粉，水彩，丙烯，国画，等等。网课线下（南京）都招生哦。网课报名可以直接点击商家页面直接报名学习哦。'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/tos-cn-avt-0015/b6edf8ccc8a249beca41eab23fdb19fb',
          nickname: '小沐',
          signature: '➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕↵                     主页橱窗有推荐必读书↵                粉丝 / 商务：shengyedushu↵             仅此一个号，其他号都是搬运🙏↵➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕'
        },
        {
          avatar: '//sf1-ttcdn-tos.pstatp.com/img/mosaic-legacy/3793/3131589739~120x256.image',
          nickname: '小气',
          signature: '👉陪伴是最好的教育，↵👀父母是孩子的第一任老师，↵🧚‍♀️一起关注孩子成长，↵👍家长好好学习，孩子天天向上！↵关注我，看更多精彩内容！↵欢迎大家投稿（要有趣/有新闻性）'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/douyin-user-file/737babf28a650b2c7b5dbe276b0a48e6',
          nickname: '小白读书',
          signature: '抖音上热门唯一官方锦鲤🐬↵直播时间: 周一到周五 17:00-23:00↵发视频@DOU+小助手，每天送流量带你上热门！戳下方“点我送流量”，快速涨粉上热门！👇👇'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/26ee20001afd449207eca',
          nickname: '丽娘',
          signature: '咨询绘画学习可以点击下方的“联系我们”↵感谢大家的支持和喜爱:citongwojx↵目前开设了多种类型的绘画班：素描，彩铅，色粉，碳晶粉，水彩，丙烯，国画，等等。网课线下（南京）都招生哦。网课报名可以直接点击商家页面直接报名学习哦。'
        }, {
          avatar: '//p9.douyinpic.com/aweme/1080x1080/tos-cn-avt-0015/b6edf8ccc8a249beca41eab23fdb19fb',
          nickname: '小沐',
          signature: '➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕↵                     主页橱窗有推荐必读书↵                粉丝 / 商务：shengyedushu↵             仅此一个号，其他号都是搬运🙏↵➕➕➕➕➕➕➕➕➕➕➕➕➕➕➕'
        }]
    }
  }
}
</script>

<style scoped>

.follow-title {
  width: 100%;
  margin: 0 auto;
  text-align: left;
  display: inline-block;
  font-style: normal;
  font-weight: normal;
  font-size: 24px;
  line-height: 34px;
  color: rgba(28,31,35,0.9);
  margin-bottom: 16px;
  font-weight: 600;
}

.huoshan-tip--36DM1 {
  margin-top: 24px;
  color: rgba(28,31,35,0.35);
  font-size: 12px;
}

.el-icon-arrow-left {
  display: inline-block;
  justify-content: center;
  align-items: center;
  width: 30px;
  height: 30px;
  line-height: 30px;
  color: rgba(254, 44, 85, 1);
  font-weight: bold;
  font-size: large;
}
.el-icon-arrow-left:hover {
  background-color: #eee;
  cursor: pointer;
}

.el-icon-arrow-right {
  display: inline-block;
  justify-content: center;
  align-items: center;
  width: 30px;
  height: 30px;
  line-height: 30px;
  color: rgba(254, 44, 85, 1);
  font-weight: bold;
  font-size: large;
}

.el-icon-arrow-right:hover {
  background-color: #eee;
  cursor: pointer;
}
</style>