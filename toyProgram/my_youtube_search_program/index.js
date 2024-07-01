import express from 'express';
import fetch from 'node-fetch';

const app = express();
const port = 3000;

const url = 'https://youtube-search6.p.rapidapi.com/channel/id/?channelName=LinusTechTips';
const options = {
  method: 'GET',
  headers: {
    'x-rapidapi-key': '81016a60e6mshbf9a662fb1837bfp197ebejsnfe222924b62d',
    'x-rapidapi-host': 'youtube-search6.p.rapidapi.com'
  }
};

// 정적 파일 제공
app.use(express.static('static_files')); //

app.get('/', async (req, res) => {
  try {
    const response = await fetch(url, options);
    const result = await response.text();
    const data = JSON.parse(result);

    // 필요한 데이터를 추출하여 클라이언트에게 전송
    const channelData = {
      channel_id: data.channel_id,
      channel_name: data.channel_name,
      thumbnail_url: data.thumbnail_url,
      description: data.description,
      subscriber_count: data.subscriber_count,
      view_count: data.view_count,
      video_count: data.video_count,
      country: data.country,
      joined_date: data.joined_date
    };

    res.json(channelData);
  } catch (error) {
    res.status(500).send(error.toString());
  }
});

app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
