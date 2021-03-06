﻿namespace Problems
{
    /// <summary>
    /// Problem: 在O(1)时间删除链表结点
    /// 给定单向链表的头指针和一个结点指针, 定义一个函数
    /// 在O(1)时间删除该结点。
    /// </summary>
    public class DeleteNodeInList
    {
        public static void Process(ref ListNode head, ListNode toBeDeleted)
        {
            if (head == null || toBeDeleted == null)
            {
                return;
            }

            if (toBeDeleted.Next != null)
            {
                toBeDeleted.Value = toBeDeleted.Next.Value;
                toBeDeleted.Next = toBeDeleted.Next.Next;
            }
            else if (toBeDeleted == head)
            {
                head = null;
            }
            else
            {
                ListNode current = head;
                while (current.Next != toBeDeleted)
                {
                    current = current.Next;
                }

                current.Next = null;
            }
        }
    }
}
