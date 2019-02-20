package Programmers.heap;

import java.util.PriorityQueue;

public class ��ũ��Ʈ�ѷ� {

	public static void main(String[] args) {
		int[][] arr = { { 0, 3 }, { 5, 8 }, {6,7} };
		System.out.println(solution(arr));

	}

	public static int solution(int[][] jobs) {
		PriorityQueue<Job> pq = new PriorityQueue<>((a,b) -> {
			if(a.getSum_time()==b.getSum_time()) {
				return a.getRequest_time() - b.getRequest_time();
			}else{
				return a.getSum_time() - b.getSum_time();
			}
			
		});
		int idx = 0;
		int sum = 0;
		int time = 0;

		while (true) {
			// ���̻� job�� ���� ���

			while (idx < jobs.length && jobs[idx][0] <= time) {

				Job job = new Job(jobs[idx][0]+jobs[idx][1],jobs[idx][0], jobs[idx][1]);
				pq.offer(job);
				idx++;
			}
			if (!pq.isEmpty()) {
				// �۾��� �������
				Job current_job = pq.remove();
				int wait = time - current_job.getRequest_time() <= 0 ? 0 : time - current_job.getRequest_time();
				time += current_job.getJob_time();
				sum += current_job.getJob_time() + wait;
			} else {
				// ���� ���
				time++;
			}
			//idx�� length�� �����ϴٴ� ���� ���̻� �۾� ť�� ���� �۾��� ���ٴ� �� 
			if (idx == jobs.length) {
				while (!pq.isEmpty()) {
					Job current_job = pq.remove();
					int wait = time - current_job.getRequest_time() <= 0 ? 0 : time - current_job.getRequest_time();
					time += current_job.getJob_time();
					sum += current_job.getJob_time() + wait;
				}
				break;
			}
		}

		return sum / 3;
	}

}

class Job {
	private int sum_time;
	private int request_time;
	private int job_time;
	public  Job(int sum_time, int request_time, int job_time) {
		
		this.sum_time = sum_time;
		this.request_time = request_time;
		this.job_time = job_time;
	}
	public int getSum_time() {
		return sum_time;
	}
	public void setSum_time(int sum_time) {
		this.sum_time = sum_time;
	}
	public int getRequest_time() {
		return request_time;
	}
	public void setRequest_time(int request_time) {
		this.request_time = request_time;
	}
	public int getJob_time() {
		return job_time;
	}
	public void setJob_time(int job_time) {
		this.job_time = job_time;
	}

	

}
