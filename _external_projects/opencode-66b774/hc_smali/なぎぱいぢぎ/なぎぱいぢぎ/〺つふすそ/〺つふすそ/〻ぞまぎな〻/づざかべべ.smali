.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;
.super Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;
.source ""


# instance fields
.field public final 〺つふすそ:Ljava/util/Calendar;

.field public final synthetic くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

.field public final げつ〴ぬぐ:Ljava/util/Calendar;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぺふねづ〺;-><init>()V

    invoke-static {}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/は〲ぱなで;->びぐびあび()Ljava/util/Calendar;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->げつ〴ぬぐ:Ljava/util/Calendar;

    invoke-static {}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/は〲ぱなで;->びぐびあび()Ljava/util/Calendar;

    move-result-object p1

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->〺つふすそ:Ljava/util/Calendar;

    return-void
.end method


# virtual methods
.method public づざかべべ(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$でどあくず;)V
    .registers 24

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    instance-of v1, v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ざっざへづ;

    if-eqz v1, :cond_e1

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v1

    instance-of v1, v1, Landroidx/recyclerview/widget/GridLayoutManager;

    if-nez v1, :cond_14

    goto/16 :goto_e1

    :cond_14
    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$びぐびあび;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ざっざへづ;

    invoke-virtual/range {p2 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v3, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    .line 1
    iget-object v3, v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;->くねねぱす〻:Lcom/google/android/material/datepicker/DateSelector;

    .line 2
    invoke-interface {v3}, Lcom/google/android/material/datepicker/DateSelector;->げつ〴ぬぐ()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2c
    :goto_2c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;

    iget-object v5, v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->げつ〴ぬぐ:Ljava/lang/Object;

    if-eqz v5, :cond_2c

    iget-object v6, v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->〺つふすそ:Ljava/lang/Object;

    if-nez v6, :cond_41

    goto :goto_2c

    :cond_41
    iget-object v6, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->げつ〴ぬぐ:Ljava/util/Calendar;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {v6, v7, v8}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-object v5, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->〺つふすそ:Ljava/util/Calendar;

    iget-object v4, v4, Lづざかべべ/〳ぜぞぜべっ/てぜきぽく/〺つふすそ;->〺つふすそ:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    iget-object v4, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->げつ〴ぬぐ:Ljava/util/Calendar;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v1, v4}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ざっざへづ;->ぁごぐすすぃ(I)I

    move-result v4

    iget-object v6, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->〺つふすそ:Ljava/util/Calendar;

    invoke-virtual {v6, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    invoke-virtual {v1, v5}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/ざっざへづ;->ぁごぐすすぃ(I)I

    move-result v5

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v7

    .line 3
    iget v8, v2, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    .line 4
    div-int/2addr v4, v8

    div-int/2addr v5, v8

    move v8, v4

    :goto_7b
    if-gt v8, v5, :cond_2c

    .line 5
    iget v9, v2, Landroidx/recyclerview/widget/GridLayoutManager;->せづっ〸ちね:I

    mul-int v9, v9, v8

    .line 6
    invoke-virtual {v2, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;->ごづごきえ(I)Landroid/view/View;

    move-result-object v9

    if-nez v9, :cond_88

    goto :goto_de

    :cond_88
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v10

    iget-object v11, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    .line 7
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;->かづげぃぁ〺:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;

    .line 8
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/げつ〴ぬぐ;

    .line 9
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Rect;

    iget v11, v11, Landroid/graphics/Rect;->top:I

    add-int/2addr v10, v11

    .line 10
    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    move-result v9

    iget-object v11, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    .line 11
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;->かづげぃぁ〺:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;

    .line 12
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;->びぐびあび:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/げつ〴ぬぐ;

    .line 13
    iget-object v11, v11, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Rect;

    iget v11, v11, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v9, v11

    if-ne v8, v4, :cond_b4

    .line 14
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v11

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v12

    div-int/lit8 v12, v12, 0x2

    add-int/2addr v12, v11

    goto :goto_b5

    :cond_b4
    const/4 v12, 0x0

    :goto_b5
    if-ne v8, v5, :cond_c3

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v11

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v13

    div-int/lit8 v13, v13, 0x2

    add-int/2addr v13, v11

    goto :goto_c7

    :cond_c3
    invoke-virtual/range {p2 .. p2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v13

    :goto_c7
    int-to-float v15, v12

    int-to-float v10, v10

    int-to-float v11, v13

    int-to-float v9, v9

    iget-object v12, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/づざかべべ;->くし〴〺ぅ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;

    .line 15
    iget-object v12, v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/びぐびあび;->かづげぃぁ〺:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;

    .line 16
    iget-object v12, v12, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/〻ぞまぎな〻/〺つふすそ;->〳ぜぞぜべっ:Landroid/graphics/Paint;

    move-object/from16 v14, p1

    move/from16 v16, v10

    move/from16 v17, v11

    move/from16 v18, v9

    move-object/from16 v19, v12

    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_de
    add-int/lit8 v8, v8, 0x1

    goto :goto_7b

    :cond_e1
    :goto_e1
    return-void
.end method
