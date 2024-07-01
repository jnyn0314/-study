
async function fetchData() {
    try {
      const response = await fetch('/');
      const data = await response.json();
      const channelInfoElement = document.getElementById('channel-info');
  
      // 채널 정보를 출력하는 부분
      const channelContainer = document.createElement('div');
      channelContainer.classList.add('channel-container');
  
      // 썸네일 이미지
      const thumbnailImg = document.createElement('img');
      thumbnailImg.src = data.thumbnail_url;
      thumbnailImg.alt = 'Channel Thumbnail';
      thumbnailImg.classList.add('channel-thumbnail');
      channelContainer.appendChild(thumbnailImg);
  
      // 채널 정보
      const channelInfo = document.createElement('div');
      channelInfo.classList.add('channel-info');
      channelInfo.innerHTML = `
        <h2>${data.channel_name}</h2>
        <p><strong>Channel ID:</strong> ${data.channel_id}</p>
        <p><strong>Description:</strong> ${data.description}</p>
        <p><strong>Subscribers:</strong> ${data.subscriber_count}</p>
        <p><strong>Views:</strong> ${data.view_count}</p>
        <p><strong>Videos:</strong> ${data.video_count}</p>
        <p><strong>Country:</strong> ${data.country}</p>
        <p><strong>Joined:</strong> ${new Date(data.joined_date).toLocaleDateString()}</p>
      `;
      channelContainer.appendChild(channelInfo);
  
      channelInfoElement.appendChild(channelContainer);
  
    } catch (error) {
      console.error('Error fetching data:', error);
    }
  }
  
  fetchData();
  