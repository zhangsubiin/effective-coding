package com.subin.code.utils;

import java.util.List;

/**
 * description: 分页工具类
 *
 * @author shaoping (zhangsubin)
 * @since 2018/9/8 11:24 PM
 */
public class ItemPage<T> {

    /**
     * - 每页数据量
     */
    private int pageSize;

    /**
     * - 当前页码
     */
    private int pageNum;

    /**
     * - 查询起始行号
     */
    private int offSet;

    /**
     * - 总数据量
     */
    private long totalPages;

    /**
     * - 总条数
     */
    private long totalCount;

    /**
     * - 结果集
     */
    private List<T> result;

    public ItemPage(int pageSize, int pageNum, long totalCount) {
        this.setPageSize(pageSize);
        this.setTotalCount(totalCount);
        this.setPageNum(pageNum);
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
        if (pageNum < 1) {
            this.pageNum = 1;
        } else if (pageNum > getTotalPages()) {
            this.pageNum = (int) getTotalPages();
        }
        // 根据当前页面自动计算起始行号
        setOffSet((this.pageNum - 1) * getPageSize());
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
        // 根据总记录数自动计算总页数
        long result = totalCount / getPageSize();
        if (totalCount % pageSize != 0) {
            result += 1;
        }
        setTotalPages(result);
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

}
