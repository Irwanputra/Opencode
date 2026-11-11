.class public Landroidx/appcompat/widget/SearchView;
.super Landroidx/appcompat/widget/LinearLayoutCompat;
.source ""

# interfaces
.implements Lづざかべべ/〺つふすそ/ぇぬぎばつ/〺つふすそ;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;,
        Landroidx/appcompat/widget/SearchView$SearchAutoComplete;,
        Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;,
        Landroidx/appcompat/widget/SearchView$SavedState;,
        Landroidx/appcompat/widget/SearchView$のぷのちつ;,
        Landroidx/appcompat/widget/SearchView$ぺふねづ〺;,
        Landroidx/appcompat/widget/SearchView$てぜきぽく;
    }
.end annotation


# static fields
.field public static final しぷげへが:Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;


# instance fields
.field public final 〱かけばぜぐ:Ljava/lang/Runnable;

.field public 〱こか〺ぃせ:Ljava/lang/CharSequence;

.field public 〴ねぷぐくぼ:Landroid/app/SearchableInfo;

.field public 〺でおいここ:Landroidx/appcompat/widget/SearchView$てぜきぽく;

.field public final 〻ぞまぎな〻:Landroid/widget/ImageView;

.field public ぃぜぶの〸ぃ:Landroid/view/View$OnClickListener;

.field public ぅみぱぎぎ:[I

.field public ぇ〳〲〺すっ:Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;

.field public final ぇいうげ〱〹:Landroid/widget/TextView$OnEditorActionListener;

.field public ぇとしたべど:Landroidx/appcompat/widget/SearchView$ぺふねづ〺;

.field public えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

.field public final ぉ〲なぱぽた:Landroid/view/View;

.field public final ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

.field public final ぉねぞはがぞ:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public final ぉひのべい:I

.field public final おかぷせ〱:Ljava/lang/CharSequence;

.field public かづげぃぁ〺:I

.field public final きぬどぼみ〸:Landroid/view/View$OnClickListener;

.field public ぎきぁ〱ぢ:Ljava/lang/Runnable;

.field public くぎぶ〼のそ:Ljava/lang/CharSequence;

.field public くねねぱす〻:Z

.field public final けときぜと:Landroid/content/Intent;

.field public げがぴうあだ:Landroid/view/View$OnFocusChangeListener;

.field public こ〲しでおか:Z

.field public final ごづごきえ:Landroid/view/View;

.field public ごまけがぢは:Ljava/lang/CharSequence;

.field public final ざっざへづ:Landroid/widget/ImageView;

.field public final ざとぅぼこ〺:Landroid/view/View;

.field public final じぜこほぱ:Landroid/widget/ImageView;

.field public ずまげせび〳:Z

.field public final せづっ〸ちね:I

.field public ち〴みぎ〻び:Z

.field public ておぞぞはね:Z

.field public final でどあくず:Landroid/widget/ImageView;

.field public どぇぞほだ:[I

.field public final な〱ちぉじ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field public ながふずは:Landroidx/appcompat/widget/SearchView$のぷのちつ;

.field public なぶひせが:Landroid/graphics/Rect;

.field public にぢ〱ぁな:Landroid/text/TextWatcher;

.field public のね〱ばぁぢ:I

.field public のびぶけせ:Landroid/view/View$OnKeyListener;

.field public final は〲ぱなで:Landroid/view/View;

.field public はつきどっ:Landroid/os/Bundle;

.field public ばおぢでぎか:Z

.field public びえぁぜい:Landroid/graphics/Rect;

.field public final びちづぼぬ:Landroid/widget/AdapterView$OnItemClickListener;

.field public final ぶでにく〼〳:Landroid/widget/ImageView;

.field public final ぷぞてのほき:Landroid/content/Intent;

.field public ぺがぅす〹ち:Z

.field public final ぺづげぺが:Landroid/graphics/drawable/Drawable;


# direct methods
.method public static constructor <clinit>()V
    .registers 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_c

    new-instance v0, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;

    invoke-direct {v0}, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;-><init>()V

    goto :goto_d

    :cond_c
    const/4 v0, 0x0

    :goto_d
    sput-object v0, Landroidx/appcompat/widget/SearchView;->しぷげへが:Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    sget v0, Lづざかべべ/〺つふすそ/げつ〴ぬぐ;->searchViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p3}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->びえぁぜい:Landroid/graphics/Rect;

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->なぶひせが:Landroid/graphics/Rect;

    const/4 v2, 0x2

    new-array v3, v2, [I

    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->どぇぞほだ:[I

    new-array v2, v2, [I

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ:[I

    new-instance v2, Landroidx/appcompat/widget/SearchView$〺つふすそ;

    invoke-direct {v2, v0}, Landroidx/appcompat/widget/SearchView$〺つふすそ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->〱かけばぜぐ:Ljava/lang/Runnable;

    new-instance v2, Landroidx/appcompat/widget/SearchView$くし〴〺ぅ;

    invoke-direct {v2, v0}, Landroidx/appcompat/widget/SearchView$くし〴〺ぅ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->ぎきぁ〱ぢ:Ljava/lang/Runnable;

    new-instance v2, Ljava/util/WeakHashMap;

    invoke-direct {v2}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->な〱ちぉじ:Ljava/util/WeakHashMap;

    new-instance v2, Landroidx/appcompat/widget/SearchView$なぎぱいぢぎ;

    invoke-direct {v2, v0}, Landroidx/appcompat/widget/SearchView$なぎぱいぢぎ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->きぬどぼみ〸:Landroid/view/View$OnClickListener;

    new-instance v3, Landroidx/appcompat/widget/SearchView$ぁごぐすすぃ;

    invoke-direct {v3, v0}, Landroidx/appcompat/widget/SearchView$ぁごぐすすぃ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->のびぶけせ:Landroid/view/View$OnKeyListener;

    new-instance v3, Landroidx/appcompat/widget/SearchView$〳ぜぞぜべっ;

    invoke-direct {v3, v0}, Landroidx/appcompat/widget/SearchView$〳ぜぞぜべっ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v3, v0, Landroidx/appcompat/widget/SearchView;->ぇいうげ〱〹:Landroid/widget/TextView$OnEditorActionListener;

    new-instance v4, Landroidx/appcompat/widget/SearchView$ぺぁあねじ;

    invoke-direct {v4, v0}, Landroidx/appcompat/widget/SearchView$ぺぁあねじ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v4, v0, Landroidx/appcompat/widget/SearchView;->びちづぼぬ:Landroid/widget/AdapterView$OnItemClickListener;

    new-instance v5, Landroidx/appcompat/widget/SearchView$いいにぽつ;

    invoke-direct {v5, v0}, Landroidx/appcompat/widget/SearchView$いいにぽつ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v5, v0, Landroidx/appcompat/widget/SearchView;->ぉねぞはがぞ:Landroid/widget/AdapterView$OnItemSelectedListener;

    new-instance v6, Landroidx/appcompat/widget/SearchView$げつ〴ぬぐ;

    invoke-direct {v6, v0}, Landroidx/appcompat/widget/SearchView$げつ〴ぬぐ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    iput-object v6, v0, Landroidx/appcompat/widget/SearchView;->にぢ〱ぁな:Landroid/text/TextWatcher;

    sget-object v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView:[I

    .line 1
    new-instance v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;

    const/4 v8, 0x0

    move-object/from16 v9, p2

    move/from16 v10, p3

    invoke-virtual {v1, v9, v6, v10, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    invoke-direct {v7, v1, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_layout:I

    sget v9, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_search_view:I

    invoke-virtual {v7, v6, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v6

    const/4 v9, 0x1

    invoke-virtual {v1, v6, v0, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    sget v1, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_src_text:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iput-object v1, v0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setSearchView(Landroidx/appcompat/widget/SearchView;)V

    sget v6, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_edit_frame:I

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Landroidx/appcompat/widget/SearchView;->ざとぅぼこ〺:Landroid/view/View;

    sget v6, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_plate:I

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v0, Landroidx/appcompat/widget/SearchView;->は〲ぱなで:Landroid/view/View;

    sget v10, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->submit_area:I

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v10

    iput-object v10, v0, Landroidx/appcompat/widget/SearchView;->ごづごきえ:Landroid/view/View;

    sget v11, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_button:I

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/ImageView;

    iput-object v11, v0, Landroidx/appcompat/widget/SearchView;->ざっざへづ:Landroid/widget/ImageView;

    sget v12, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_go_btn:I

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/ImageView;

    iput-object v12, v0, Landroidx/appcompat/widget/SearchView;->でどあくず:Landroid/widget/ImageView;

    sget v13, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_close_btn:I

    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Landroid/widget/ImageView;

    iput-object v13, v0, Landroidx/appcompat/widget/SearchView;->ぶでにく〼〳:Landroid/widget/ImageView;

    sget v14, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_voice_btn:I

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Landroid/widget/ImageView;

    iput-object v14, v0, Landroidx/appcompat/widget/SearchView;->〻ぞまぎな〻:Landroid/widget/ImageView;

    sget v15, Lづざかべべ/〺つふすそ/なぎぱいぢぎ;->search_mag_icon:I

    invoke-virtual {v0, v15}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/ImageView;

    iput-object v15, v0, Landroidx/appcompat/widget/SearchView;->じぜこほぱ:Landroid/widget/ImageView;

    sget v9, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_queryBackground:I

    invoke-virtual {v7, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-static {v6, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇとしたべど(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_submitBackground:I

    invoke-virtual {v7, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-static {v10, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぇとしたべど(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_searchIcon:I

    invoke-virtual {v7, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v11, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v9, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_goIcon:I

    invoke-virtual {v7, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v12, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v9, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_closeIcon:I

    invoke-virtual {v7, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v13, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v9, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_voiceIcon:I

    invoke-virtual {v7, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    invoke-virtual {v14, v9}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v7, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v15, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_searchHintIcon:I

    invoke-virtual {v7, v6}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->ぁごぐすすぃ(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    iput-object v6, v0, Landroidx/appcompat/widget/SearchView;->ぺづげぺが:Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v9, Lづざかべべ/〺つふすそ/〳ぜぞぜべっ;->abc_searchview_description_search:I

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v11, v6}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ/いいにぽつ;->〺〲に〼へ〸(Landroid/view/View;Ljava/lang/CharSequence;)V

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_suggestionRowLayout:I

    sget v9, Lづざかべべ/〺つふすそ/ぁごぐすすぃ;->abc_search_dropdown_item_icons_2line:I

    invoke-virtual {v7, v6, v9}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v6

    iput v6, v0, Landroidx/appcompat/widget/SearchView;->ぉひのべい:I

    sget v6, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_commitIcon:I

    invoke-virtual {v7, v6, v8}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->のぷのちつ(II)I

    move-result v6

    iput v6, v0, Landroidx/appcompat/widget/SearchView;->せづっ〸ちね:I

    invoke-virtual {v11, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v13, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v12, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v14, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Landroidx/appcompat/widget/SearchView;->にぢ〱ぁな:Landroid/text/TextWatcher;

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v1, v3}, Landroid/widget/AutoCompleteTextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    invoke-virtual {v1, v4}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-virtual {v1, v5}, Landroid/widget/AutoCompleteTextView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v2, v0, Landroidx/appcompat/widget/SearchView;->のびぶけせ:Landroid/view/View$OnKeyListener;

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    new-instance v2, Landroidx/appcompat/widget/SearchView$びぐびあび;

    invoke-direct {v2, v0}, Landroidx/appcompat/widget/SearchView$びぐびあび;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v1, v2}, Landroid/widget/AutoCompleteTextView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_iconifiedByDefault:I

    const/4 v3, 0x1

    invoke-virtual {v7, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setIconifiedByDefault(Z)V

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_android_maxWidth:I

    const/4 v3, -0x1

    invoke-virtual {v7, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->なぎぱいぢぎ(II)I

    move-result v2

    if-eq v2, v3, :cond_178

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setMaxWidth(I)V

    :cond_178
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_defaultQueryHint:I

    invoke-virtual {v7, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->おかぷせ〱:Ljava/lang/CharSequence;

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_queryHint:I

    invoke-virtual {v7, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->おぐぴう〸ず(I)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->ごまけがぢは:Ljava/lang/CharSequence;

    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_android_imeOptions:I

    invoke-virtual {v7, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v2

    if-eq v2, v3, :cond_193

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setImeOptions(I)V

    :cond_193
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_android_inputType:I

    invoke-virtual {v7, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->いいにぽつ(II)I

    move-result v2

    if-eq v2, v3, :cond_19e

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView;->setInputType(I)V

    :cond_19e
    sget v2, Lづざかべべ/〺つふすそ/いいにぽつ;->SearchView_android_focusable:I

    const/4 v3, 0x1

    invoke-virtual {v7, v2, v3}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->げつ〴ぬぐ(IZ)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 3
    iget-object v2, v7, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぺづげぺが;->〺つふすそ:Landroid/content/res/TypedArray;

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 4
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.speech.action.WEB_SEARCH"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->ぷぞてのほき:Landroid/content/Intent;

    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v4, "android.speech.extra.LANGUAGE_MODEL"

    const-string v5, "web_search"

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v2, v0, Landroidx/appcompat/widget/SearchView;->けときぜと:Landroid/content/Intent;

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getDropDownAnchor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, Landroidx/appcompat/widget/SearchView;->ぉ〲なぱぽた:Landroid/view/View;

    if-eqz v1, :cond_1e2

    new-instance v2, Landroidx/appcompat/widget/SearchView$づざかべべ;

    invoke-direct {v2, v0}, Landroidx/appcompat/widget/SearchView$づざかべべ;-><init>(Landroidx/appcompat/widget/SearchView;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_1e2
    iget-boolean v1, v0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ()V

    return-void
.end method

.method private getPreferredHeight()I
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lづざかべべ/〺つふすそ/びぐびあび;->abc_search_view_preferred_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private getPreferredWidth()I
    .registers 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lづざかべべ/〺つふすそ/びぐびあび;->abc_search_view_preferred_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method private setQuery(Ljava/lang/CharSequence;)V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 p1, 0x0

    goto :goto_13

    :cond_f
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    :goto_13
    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    return-void
.end method


# virtual methods
.method public clearFocus()V
    .registers 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ぺがぅす〹ち:Z

    invoke-super {p0}, Landroid/view/ViewGroup;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->clearFocus()V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->ぺがぅす〹ち:Z

    return-void
.end method

.method public getImeOptions()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I

    move-result v0

    return v0
.end method

.method public getInputType()I
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getInputType()I

    move-result v0

    return v0
.end method

.method public getMaxWidth()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->のね〱ばぁぢ:I

    return v0
.end method

.method public getQuery()Ljava/lang/CharSequence;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public getQueryHint()Ljava/lang/CharSequence;
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ごまけがぢは:Ljava/lang/CharSequence;

    if-eqz v0, :cond_5

    goto :goto_20

    :cond_5
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_20

    :cond_1e
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->おかぷせ〱:Ljava/lang/CharSequence;

    :goto_20
    return-object v0
.end method

.method public getSuggestionCommitIconResId()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->せづっ〸ちね:I

    return v0
.end method

.method public getSuggestionRowLayout()I
    .registers 2

    iget v0, p0, Landroidx/appcompat/widget/SearchView;->ぉひのべい:I

    return v0
.end method

.method public getSuggestionsAdapter()Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    return-object v0
.end method

.method public onDetachedFromWindow()V
    .registers 2

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->〱かけばぜぐ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぎきぁ〱ぢ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public onLayout(ZIIII)V
    .registers 9

    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/LinearLayoutCompat;->onLayout(ZIIII)V

    if-eqz p1, :cond_58

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->びえぁぜい:Landroid/graphics/Rect;

    .line 1
    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->どぇぞほだ:[I

    invoke-virtual {p1, p4}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ:[I

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getLocationInWindow([I)V

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->どぇぞほだ:[I

    const/4 v0, 0x1

    aget v1, p4, v0

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ:[I

    aget v0, v2, v0

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    aget p4, p4, v0

    aget v2, v2, v0

    sub-int/2addr p4, v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v2, p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p2, p4, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 2
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->なぶひせが:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->びえぁぜい:Landroid/graphics/Rect;

    iget p4, p2, Landroid/graphics/Rect;->left:I

    iget p2, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    invoke-virtual {p1, p4, v0, p2, p5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;

    if-nez p1, :cond_51

    new-instance p1, Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;

    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->なぶひせが:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->びえぁぜい:Landroid/graphics/Rect;

    iget-object p4, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-direct {p1, p2, p3, p4}, Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;-><init>(Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/view/View;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぇ〳〲〺すっ:Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    goto :goto_58

    :cond_51
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->なぶひせが:Landroid/graphics/Rect;

    iget-object p3, p0, Landroidx/appcompat/widget/SearchView;->びえぁぜい:Landroid/graphics/Rect;

    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/widget/SearchView$おぐぴう〸ず;->げつ〴ぬぐ(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_58
    :goto_58
    return-void
.end method

.method public onMeasure(II)V
    .registers 6

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    if-eqz v0, :cond_8

    .line 2
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    return-void

    :cond_8
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_2a

    if-eqz v0, :cond_20

    if-eq v0, v2, :cond_1b

    goto :goto_37

    :cond_1b
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->のね〱ばぁぢ:I

    if-lez v0, :cond_37

    goto :goto_2e

    :cond_20
    iget p1, p0, Landroidx/appcompat/widget/SearchView;->のね〱ばぁぢ:I

    if-lez p1, :cond_25

    goto :goto_37

    :cond_25
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result p1

    goto :goto_37

    :cond_2a
    iget v0, p0, Landroidx/appcompat/widget/SearchView;->のね〱ばぁぢ:I

    if-lez v0, :cond_2f

    :goto_2e
    goto :goto_33

    :cond_2f
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredWidth()I

    move-result v0

    :goto_33
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_37
    :goto_37
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    if-eq v0, v1, :cond_49

    if-eqz v0, :cond_44

    goto :goto_51

    :cond_44
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result p2

    goto :goto_51

    :cond_49
    invoke-direct {p0}, Landroidx/appcompat/widget/SearchView;->getPreferredHeight()I

    move-result v0

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    :goto_51
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->onMeasure(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .registers 3

    instance-of v0, p1, Landroidx/appcompat/widget/SearchView$SavedState;

    if-nez v0, :cond_8

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_8
    check-cast p1, Landroidx/appcompat/widget/SearchView$SavedState;

    .line 1
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->〺つふすそ:Landroid/os/Parcelable;

    .line 2
    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-boolean p1, p1, Landroidx/appcompat/widget/SearchView$SavedState;->びぐびあび:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .registers 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Landroidx/appcompat/widget/SearchView$SavedState;

    invoke-direct {v1, v0}, Landroidx/appcompat/widget/SearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    .line 2
    iput-boolean v0, v1, Landroidx/appcompat/widget/SearchView$SavedState;->びぐびあび:Z

    return-object v1
.end method

.method public onWindowFocusChanged(Z)V
    .registers 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowFocusChanged(Z)V

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〱かけばぜぐ:Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .registers 5

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ぺがぅす〹ち:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isFocusable()Z

    move-result v0

    if-nez v0, :cond_d

    return v1

    .line 1
    :cond_d
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    if-nez v0, :cond_1d

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1, p2}, Landroid/widget/AutoCompleteTextView;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_1c

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    :cond_1c
    return p1

    :cond_1d
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public setAppSearchData(Landroid/os/Bundle;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->はつきどっ:Landroid/os/Bundle;

    return-void
.end method

.method public setIconified(Z)V
    .registers 2

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ざっざへづ()V

    goto :goto_9

    :cond_6
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ぉ〲なぱぽた()V

    :goto_9
    return-void
.end method

.method public setIconifiedByDefault(Z)V
    .registers 3

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    if-ne v0, p1, :cond_5

    return-void

    :cond_5
    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ()V

    return-void
.end method

.method public setImeOptions(I)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    return-void
.end method

.method public setInputType(I)V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V

    return-void
.end method

.method public setMaxWidth(I)V
    .registers 2

    iput p1, p0, Landroidx/appcompat/widget/SearchView;->のね〱ばぁぢ:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestLayout()V

    return-void
.end method

.method public setOnCloseListener(Landroidx/appcompat/widget/SearchView$ぺふねづ〺;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぇとしたべど:Landroidx/appcompat/widget/SearchView$ぺふねづ〺;

    return-void
.end method

.method public setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->げがぴうあだ:Landroid/view/View$OnFocusChangeListener;

    return-void
.end method

.method public setOnQueryTextListener(Landroidx/appcompat/widget/SearchView$てぜきぽく;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->〺でおいここ:Landroidx/appcompat/widget/SearchView$てぜきぽく;

    return-void
.end method

.method public setOnSearchClickListener(Landroid/view/View$OnClickListener;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぃぜぶの〸ぃ:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public setOnSuggestionListener(Landroidx/appcompat/widget/SearchView$のぷのちつ;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ながふずは:Landroidx/appcompat/widget/SearchView$のぷのちつ;

    return-void
.end method

.method public setQuery(Ljava/lang/CharSequence;Z)V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_12

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->くぎぶ〼のそ:Ljava/lang/CharSequence;

    :cond_12
    if-eqz p2, :cond_1d

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1d

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ぇ〳〲〺すっ()V

    :cond_1d
    return-void
.end method

.method public setQueryHint(Ljava/lang/CharSequence;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->ごまけがぢは:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ()V

    return-void
.end method

.method public setQueryRefinementEnabled(Z)V
    .registers 4

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->こ〲しでおか:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    instance-of v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    if-eqz v1, :cond_11

    check-cast v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    if-eqz p1, :cond_e

    const/4 p1, 0x2

    goto :goto_f

    :cond_e
    const/4 p1, 0x1

    .line 1
    :goto_f
    iput p1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざとぅぼこ〺:I

    :cond_11
    return-void
.end method

.method public setSearchableInfo(Landroid/app/SearchableInfo;)V
    .registers 8

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    const/4 v0, 0x1

    const/high16 v1, 0x10000

    const/4 v2, 0x0

    if-eqz p1, :cond_6e

    .line 1
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestThreshold()I

    move-result p1

    invoke-virtual {v3, p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setThreshold(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getImeOptions()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getInputType()I

    move-result p1

    and-int/lit8 v3, p1, 0xf

    if-ne v3, v0, :cond_36

    const v3, -0x10001

    and-int/2addr p1, v3

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {v3}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_36

    or-int/2addr p1, v1

    const/high16 v3, 0x80000

    or-int/2addr p1, v3

    :cond_36
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, p1}, Landroid/widget/AutoCompleteTextView;->setInputType(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-eqz p1, :cond_42

    invoke-virtual {p1, v2}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->〺つふすそ(Landroid/database/Cursor;)V

    :cond_42
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_6b

    new-instance p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    iget-object v5, p0, Landroidx/appcompat/widget/SearchView;->な〱ちぉじ:Ljava/util/WeakHashMap;

    invoke-direct {p1, v3, p0, v4, v5}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    check-cast p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->こ〲しでおか:Z

    if-eqz v3, :cond_68

    const/4 v3, 0x2

    goto :goto_69

    :cond_68
    const/4 v3, 0x1

    .line 2
    :goto_69
    iput v3, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ざとぅぼこ〺:I

    .line 3
    :cond_6b
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->ぅみぱぎぎ()V

    .line 4
    :cond_6e
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    const/4 v3, 0x0

    if-eqz p1, :cond_9f

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchEnabled()Z

    move-result p1

    if-eqz p1, :cond_9f

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result p1

    if-eqz p1, :cond_84

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ぷぞてのほき:Landroid/content/Intent;

    goto :goto_8e

    :cond_84
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result p1

    if-eqz p1, :cond_8e

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->けときぜと:Landroid/content/Intent;

    :cond_8e
    :goto_8e
    if-eqz v2, :cond_9f

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_9f

    goto :goto_a0

    :cond_9f
    const/4 v0, 0x0

    .line 5
    :goto_a0
    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->くねねぱす〻:Z

    if-eqz v0, :cond_ab

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v0, "nm"

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setPrivateImeOptions(Ljava/lang/String;)V

    .line 6
    :cond_ab
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    .line 7
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    return-void
.end method

.method public setSubmitButtonEnabled(Z)V
    .registers 2

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ばおぢでぎか:Z

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    return-void
.end method

.method public setSuggestionsAdapter(Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    return-void
.end method

.method public 〻ぞまぎな〻(Ljava/lang/CharSequence;)V
    .registers 2

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ぅみぱぎぎ()V
    .registers 8

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->getQueryHint()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    if-nez v0, :cond_a

    const-string v0, ""

    .line 1
    :cond_a
    iget-boolean v2, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    if-eqz v2, :cond_42

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ぺづげぺが:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_13

    goto :goto_42

    :cond_13
    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->getTextSize()F

    move-result v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x3ff4000000000000L    # 1.25

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    double-to-int v2, v2

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぺづげぺが:Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance v2, Landroid/text/SpannableStringBuilder;

    const-string v3, "   "

    invoke-direct {v2, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Landroid/text/style/ImageSpan;

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->ぺづげぺが:Landroid/graphics/drawable/Drawable;

    invoke-direct {v3, v4}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/16 v6, 0x21

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-object v0, v2

    .line 2
    :cond_42
    :goto_42
    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setHint(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ぇ〳〲〺すっ()V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_33

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_33

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->〺でおいここ:Landroidx/appcompat/widget/SearchView$てぜきぽく;

    if-eqz v1, :cond_1c

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/appcompat/widget/SearchView$てぜきぽく;->〺つふすそ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_33

    :cond_1c
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_29

    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v1, v0}, Landroidx/appcompat/widget/SearchView;->ごづごきえ(ILjava/lang/String;Ljava/lang/String;)V

    :cond_29
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    :cond_33
    return-void
.end method

.method public ぉ〲なぱぽた()V
    .registers 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぃぜぶの〸ぃ:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_16

    invoke-interface {v0, p0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_16
    return-void
.end method

.method public final ぉざぅち〻(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
    .registers 8

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    if-eqz p2, :cond_f

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :cond_f
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->くぎぶ〼のそ:Ljava/lang/CharSequence;

    const-string p2, "user_query"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    if-eqz p4, :cond_1d

    const-string p1, "query"

    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_1d
    if-eqz p3, :cond_24

    const-string p1, "intent_extra_data_key"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_24
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->はつきどっ:Landroid/os/Bundle;

    if-eqz p1, :cond_2d

    const-string p2, "app_data"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2d
    if-eqz p5, :cond_39

    const-string p1, "action_key"

    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "action_msg"

    invoke-virtual {v0, p1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_39
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    return-object v0
.end method

.method public final ぉひのべい(Z)V
    .registers 7

    iput-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p1, :cond_9

    const/4 v2, 0x0

    goto :goto_b

    :cond_9
    const/16 v2, 0x8

    :goto_b
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Landroidx/appcompat/widget/SearchView;->ざっざへづ:Landroid/widget/ImageView;

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/SearchView;->ぺづげぺが(Z)V

    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->ざとぅぼこ〺:Landroid/view/View;

    if-eqz p1, :cond_26

    const/16 p1, 0x8

    goto :goto_27

    :cond_26
    const/4 p1, 0x0

    :goto_27
    invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->じぜこほぱ:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_36

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    if-eqz p1, :cond_38

    :cond_36
    const/16 v0, 0x8

    :cond_38
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->じぜこほぱ:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->なぶひせが()V

    xor-int/lit8 p1, v3, 0x1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->せづっ〸ちね(Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->じぜこほぱ()V

    return-void
.end method

.method public くし〴〺ぅ()V
    .registers 4

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ずまげせび〳:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ずまげせび〳:Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/SearchView;->かづげぃぁ〺:I

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const/high16 v2, 0x2000000

    or-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    return-void
.end method

.method public ごづごきえ(ILjava/lang/String;Ljava/lang/String;)V
    .registers 11

    const-string v1, "android.intent.action.SEARCH"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v4, p3

    move v5, p1

    invoke-virtual/range {v0 .. v6}, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public ざっざへづ()V
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_22

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    if-eqz v0, :cond_33

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぇとしたべど:Landroidx/appcompat/widget/SearchView$ぺふねづ〺;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Landroidx/appcompat/widget/SearchView$ぺふねづ〺;->げつ〴ぬぐ()Z

    move-result v0

    if-nez v0, :cond_33

    :cond_1b
    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    goto :goto_33

    :cond_22
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    const-string v2, ""

    invoke-virtual {v0, v2}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->requestFocus()Z

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    :cond_33
    :goto_33
    return-void
.end method

.method public final ざとぅぼこ〺(Landroid/content/Intent;Landroid/app/SearchableInfo;)Landroid/content/Intent;
    .registers 12

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEARCH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v2, v3, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->はつきどっ:Landroid/os/Bundle;

    if-eqz v3, :cond_27

    const-string v4, "app_data"

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_27
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const/4 p1, 0x1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v5

    if-eqz v5, :cond_40

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_42

    :cond_40
    const-string v5, "free_form"

    :goto_42
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_52

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_53

    :cond_52
    move-object v6, v7

    :goto_53
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v8

    if-eqz v8, :cond_62

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v8

    invoke-virtual {v4, v8}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_63

    :cond_62
    move-object v4, v7

    :goto_63
    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v8

    if-eqz v8, :cond_6d

    invoke-virtual {p2}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result p1

    :cond_6d
    const-string p2, "android.speech.extra.LANGUAGE_MODEL"

    invoke-virtual {v3, p2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.PROMPT"

    invoke-virtual {v3, p2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.LANGUAGE"

    invoke-virtual {v3, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v3, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    if-nez v0, :cond_84

    goto :goto_88

    :cond_84
    invoke-virtual {v0}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v7

    :goto_88
    const-string p1, "calling_package"

    invoke-virtual {v3, p1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT"

    invoke-virtual {v3, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    invoke-virtual {v3, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v3
.end method

.method public final じぜこほぱ()V
    .registers 3

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ばおぢでぎか:Z

    const/4 v1, 0x0

    if-nez v0, :cond_9

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->くねねぱす〻:Z

    if-eqz v0, :cond_f

    .line 2
    :cond_9
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    if-nez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_10

    :cond_f
    const/4 v0, 0x0

    :goto_10
    if-eqz v0, :cond_23

    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->でどあくず:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_25

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->〻ぞまぎな〻:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_23

    goto :goto_25

    :cond_23
    const/16 v1, 0x8

    :cond_25
    :goto_25
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ごづごきえ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final せづっ〸ちね(Z)V
    .registers 4

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->くねねぱす〻:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_13

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    if-nez v0, :cond_13

    if-eqz p1, :cond_13

    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->でどあくず:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 v1, 0x0

    :cond_13
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->〻ぞまぎな〻:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public づざかべべ()V
    .registers 4

    const-string v0, ""

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    invoke-virtual {p0}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/SearchView;->ぉひのべい(Z)V

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget v2, p0, Landroidx/appcompat/widget/SearchView;->かづげぃぁ〺:I

    invoke-virtual {v0, v2}, Landroid/widget/AutoCompleteTextView;->setImeOptions(I)V

    iput-boolean v1, p0, Landroidx/appcompat/widget/SearchView;->ずまげせび〳:Z

    return-void
.end method

.method public でどあくず(I)Z
    .registers 11

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ながふずは:Landroidx/appcompat/widget/SearchView$のぷのちつ;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/SearchView$のぷのちつ;->〺つふすそ(I)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_d

    :cond_c
    return v1

    :cond_d
    :goto_d
    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 2
    iget-object v0, v0, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-eqz v0, :cond_b0

    .line 3
    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_b0

    const/4 p1, 0x0

    :try_start_1c
    const-string v2, "suggest_intent_action"

    .line 4
    sget v3, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->ぇ〳〲〺すっ:I

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_30

    .line 5
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object v2

    :cond_30
    if-nez v2, :cond_34

    const-string v2, "android.intent.action.SEARCH"

    :cond_34
    move-object v3, v2

    const-string v2, "suggest_intent_data"

    .line 6
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_47

    .line 7
    iget-object v2, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    invoke-virtual {v2}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object v2

    :cond_47
    if-eqz v2, :cond_6d

    const-string v4, "suggest_intent_data_id"

    .line 8
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-static {v0, v4}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6d

    .line 9
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_6d
    if-nez v2, :cond_71

    move-object v4, p1

    goto :goto_76

    :cond_71
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    move-object v4, v2

    :goto_76
    const-string v2, "suggest_intent_query"

    .line 10
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v6

    const-string v2, "suggest_intent_extra_data"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-static {v0, v2}, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぇ〳〲〺すっ;->〳ぜぞぜべっ(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v5

    move-object v2, p0

    .line 11
    invoke-virtual/range {v2 .. v8}, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object p1
    :try_end_8f
    .catch Ljava/lang/RuntimeException; {:try_start_1c .. :try_end_8f} :catch_90

    goto :goto_95

    :catch_90
    :try_start_90
    invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I
    :try_end_93
    .catch Ljava/lang/RuntimeException; {:try_start_90 .. :try_end_93} :catch_94

    goto :goto_95

    :catch_94
    nop

    :goto_95
    if-nez p1, :cond_98

    goto :goto_b0

    .line 12
    :cond_98
    :try_start_98
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_9f
    .catch Ljava/lang/RuntimeException; {:try_start_98 .. :try_end_9f} :catch_a0

    goto :goto_b0

    :catch_a0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed launch activity: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    :cond_b0
    :goto_b0
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->setImeVisibility(Z)V

    .line 14
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->dismissDropDown()V

    const/4 p1, 0x1

    return p1
.end method

.method public どぇぞほだ()V
    .registers 3

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Landroid/view/ViewGroup;->FOCUSED_STATE_SET:[I

    goto :goto_d

    :cond_b
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    :goto_d
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->は〲ぱなで:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_18
    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ごづごきえ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_23

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_23
    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public final なぶひせが()V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-nez v0, :cond_19

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->ておぞぞはね:Z

    if-eqz v3, :cond_18

    iget-boolean v3, p0, Landroidx/appcompat/widget/SearchView;->ずまげせび〳:Z

    if-nez v3, :cond_18

    goto :goto_19

    :cond_18
    const/4 v1, 0x0

    :cond_19
    :goto_19
    iget-object v3, p0, Landroidx/appcompat/widget/SearchView;->ぶでにく〼〳:Landroid/widget/ImageView;

    if-eqz v1, :cond_1e

    goto :goto_20

    :cond_1e
    const/16 v2, 0x8

    :goto_20
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ぶでにく〼〳:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_35

    if-eqz v0, :cond_30

    sget-object v0, Landroid/view/ViewGroup;->ENABLED_STATE_SET:[I

    goto :goto_32

    :cond_30
    sget-object v0, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    :goto_32
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_35
    return-void
.end method

.method public は〲ぱなで()V
    .registers 5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_c

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->refreshAutoCompleteResults()V

    goto :goto_33

    :cond_c
    sget-object v0, Landroidx/appcompat/widget/SearchView;->しぷげへが:Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;->げつ〴ぬぐ()V

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;->げつ〴ぬぐ:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    if-eqz v0, :cond_20

    :try_start_1b
    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_20} :catch_20

    .line 2
    :catch_20
    :cond_20
    sget-object v0, Landroidx/appcompat/widget/SearchView;->しぷげへが:Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;->げつ〴ぬぐ()V

    iget-object v0, v0, Landroidx/appcompat/widget/SearchView$へぬ〴づぞ;->〺つふすそ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_33

    :try_start_2e
    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_33
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_33} :catch_33

    :catch_33
    :cond_33
    :goto_33
    return-void
.end method

.method public びえぁぜい(ILandroid/view/KeyEvent;)Z
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->〴ねぷぐくぼ:Landroid/app/SearchableInfo;

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return v1

    :cond_6
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    if-nez v0, :cond_b

    return v1

    :cond_b
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_65

    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result p2

    if-eqz p2, :cond_65

    const/16 p2, 0x42

    if-eq p1, p2, :cond_5a

    const/16 p2, 0x54

    if-eq p1, p2, :cond_5a

    const/16 p2, 0x3d

    if-ne p1, p2, :cond_24

    goto :goto_5a

    :cond_24
    const/16 p2, 0x15

    if-eq p1, p2, :cond_3a

    const/16 v0, 0x16

    if-ne p1, v0, :cond_2d

    goto :goto_3a

    :cond_2d
    const/16 p2, 0x13

    if-ne p1, p2, :cond_65

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    move-result p1

    if-nez p1, :cond_65

    return v1

    :cond_3a
    :goto_3a
    if-ne p1, p2, :cond_3e

    const/4 p1, 0x0

    goto :goto_44

    :cond_3e
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->length()I

    move-result p1

    :goto_44
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1, v1}, Landroid/widget/AutoCompleteTextView;->setListSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->clearListSelection()V

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->げつ〴ぬぐ()V

    const/4 p1, 0x1

    return p1

    :cond_5a
    :goto_5a
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getListSelection()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SearchView;->でどあくず(I)Z

    move-result p1

    return p1

    :cond_65
    return v1
.end method

.method public ぶでにく〼〳(I)Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ながふずは:Landroidx/appcompat/widget/SearchView$のぷのちつ;

    if-eqz v0, :cond_d

    invoke-interface {v0, p1}, Landroidx/appcompat/widget/SearchView$のぷのちつ;->げつ〴ぬぐ(I)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_d

    :cond_b
    const/4 p1, 0x0

    return p1

    .line 1
    :cond_d
    :goto_d
    iget-object v0, p0, Landroidx/appcompat/widget/SearchView;->ぉざぅち〻:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getText()Landroid/text/Editable;

    move-result-object v0

    iget-object v1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    .line 2
    iget-object v1, v1, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび:Landroid/database/Cursor;

    if-nez v1, :cond_1a

    goto :goto_2f

    .line 3
    :cond_1a
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_2c

    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->えがぐせほち:Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;

    invoke-virtual {p1, v1}, Lづざかべべ/ぺぁあねじ/げつ〴ぬぐ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object p1

    if-eqz p1, :cond_2c

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    goto :goto_2f

    :cond_2c
    invoke-direct {p0, v0}, Landroidx/appcompat/widget/SearchView;->setQuery(Ljava/lang/CharSequence;)V

    :goto_2f
    const/4 p1, 0x1

    return p1
.end method

.method public final ぺづげぺが(Z)V
    .registers 4

    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ばおぢでぎか:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_21

    if-nez v0, :cond_b

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->くねねぱす〻:Z

    if-eqz v0, :cond_11

    .line 2
    :cond_b
    iget-boolean v0, p0, Landroidx/appcompat/widget/SearchView;->ち〴みぎ〻び:Z

    if-nez v0, :cond_11

    const/4 v0, 0x1

    goto :goto_12

    :cond_11
    const/4 v0, 0x0

    :goto_12
    if-eqz v0, :cond_21

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_21

    if-nez p1, :cond_23

    iget-boolean p1, p0, Landroidx/appcompat/widget/SearchView;->くねねぱす〻:Z

    if-nez p1, :cond_21

    goto :goto_23

    :cond_21
    const/16 v1, 0x8

    :cond_23
    :goto_23
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->でどあくず:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
