package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Reader;
import org.mybatis.cdi.Mapper;

@Mapper
public interface ReaderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.READER
     *
     * @mbg.generated Tue Apr 05 07:22:11 EEST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.READER
     *
     * @mbg.generated Tue Apr 05 07:22:11 EEST 2022
     */
    int insert(Reader record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.READER
     *
     * @mbg.generated Tue Apr 05 07:22:11 EEST 2022
     */
    Reader selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.READER
     *
     * @mbg.generated Tue Apr 05 07:22:11 EEST 2022
     */
    List<Reader> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.READER
     *
     * @mbg.generated Tue Apr 05 07:22:11 EEST 2022
     */
    int updateByPrimaryKey(Reader record);
}