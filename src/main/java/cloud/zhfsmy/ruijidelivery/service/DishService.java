package cloud.zhfsmy.ruijidelivery.service;

import cloud.zhfsmy.ruijidelivery.dto.DishDto;
import cloud.zhfsmy.ruijidelivery.entity.Dish;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface DishService extends IService<Dish> {
    /**
     * 分页查询菜品列表(带分类数据)
     */
    Page<DishDto> page(int page, int pageSize, String name);

    /**
     * 新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
     */
    void saveWithFlavor(DishDto dishDto);

    /**
     * 根据id查询菜品信息和对应的口味信息
     */
    DishDto getByIdWithFlavor(Long id);

    /**
     * 更新菜品信息，同时更新对应的口味信息
     */
    void updateWithFlavor(DishDto dishDto);

    /**
     * 批量删除菜品
     */
    void removeBatch(List<Long> ids);
}
