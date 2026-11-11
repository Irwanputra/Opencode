.class public final Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Landroid/view/View$AccessibilityDelegate;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;)V
    .registers 2

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .registers 3

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 1
    iget-object p1, p1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;->げつ〴ぬぐ:Ljava/lang/Object;

    .line 2
    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .registers 20

    move-object/from16 v0, p1

    .line 1
    const-class v1, Ljava/lang/Boolean;

    new-instance v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    sget-object v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げつ〴ぬぐ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    new-instance v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぇぬぎばつ;

    sget v5, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_screen_reader_focusable:I

    const/16 v6, 0x1c

    invoke-direct {v4, v5, v1, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぇぬぎばつ;-><init>(ILjava/lang/Class;I)V

    .line 4
    invoke-virtual {v4, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-nez v4, :cond_20

    const/4 v4, 0x0

    goto :goto_24

    :cond_20
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    .line 5
    :goto_24
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v7, v6, :cond_2e

    iget-object v8, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v8, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScreenReaderFocusable(Z)V

    goto :goto_32

    :cond_2e
    const/4 v8, 0x1

    invoke-virtual {v2, v8, v4}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->は〲ぱなで(IZ)V

    .line 6
    :goto_32
    new-instance v4, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;

    sget v8, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_heading:I

    invoke-direct {v4, v8, v1, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざとぅぼこ〺;-><init>(ILjava/lang/Class;I)V

    .line 7
    invoke-virtual {v4, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_43

    const/4 v1, 0x0

    goto :goto_47

    :cond_43
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_47
    if-lt v7, v6, :cond_4f

    .line 8
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHeading(Z)V

    goto :goto_53

    :cond_4f
    const/4 v4, 0x2

    invoke-virtual {v2, v4, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->は〲ぱなで(IZ)V

    .line 9
    :goto_53
    new-instance v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉざぅち〻;

    sget v4, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_pane_title:I

    const-class v8, Ljava/lang/CharSequence;

    const/16 v9, 0x8

    invoke-direct {v1, v4, v8, v9, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉざぅち〻;-><init>(ILjava/lang/Class;II)V

    .line 10
    invoke-virtual {v1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず$〺つふすそ;->くし〴〺ぅ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v4, 0x13

    if-lt v7, v6, :cond_6e

    .line 11
    iget-object v6, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v6, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPaneTitle(Ljava/lang/CharSequence;)V

    goto :goto_7b

    :cond_6e
    if-lt v7, v4, :cond_7b

    iget-object v6, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"

    invoke-virtual {v6, v8, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_7b
    :goto_7b
    move-object/from16 v1, p0

    .line 12
    iget-object v6, v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v6, v0, v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    invoke-virtual/range {p2 .. p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    if-lt v7, v4, :cond_19a

    const/16 v6, 0x1a

    if-ge v7, v6, :cond_19a

    const-string v6, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"

    const-string v8, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"

    const-string v9, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"

    const-string v10, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"

    if-lt v7, v4, :cond_ba

    .line 13
    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v4, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v4, v9}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v4, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v4, v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 14
    :cond_ba
    sget v4, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_clickable_spans:I

    invoke-virtual {v0, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/SparseArray;

    if-eqz v4, :cond_fd

    .line 15
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v11, 0x0

    :goto_ca
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v12

    if-ge v11, v12, :cond_e6

    invoke-virtual {v4, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/ref/WeakReference;

    invoke-virtual {v12}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_e3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e3
    add-int/lit8 v11, v11, 0x1

    goto :goto_ca

    :cond_e6
    const/4 v11, 0x0

    :goto_e7
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v11, v12, :cond_fd

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v4, v12}, Landroid/util/SparseArray;->remove(I)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_e7

    .line 16
    :cond_fd
    invoke-static {v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->なぎぱいぢぎ(Ljava/lang/CharSequence;)[Landroid/text/style/ClickableSpan;

    move-result-object v4

    if-eqz v4, :cond_19a

    array-length v7, v4

    if-lez v7, :cond_19a

    invoke-virtual {v2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->〳ぜぞぜべっ()Landroid/os/Bundle;

    move-result-object v7

    sget v11, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->accessibility_action_clickable_span:I

    const-string v12, "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"

    invoke-virtual {v7, v12, v11}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 17
    sget v7, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_clickable_spans:I

    invoke-virtual {v0, v7}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/util/SparseArray;

    if-nez v11, :cond_123

    .line 18
    new-instance v11, Landroid/util/SparseArray;

    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {v0, v7, v11}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_123
    const/4 v7, 0x0

    .line 19
    :goto_124
    array-length v12, v4

    if-ge v7, v12, :cond_19a

    aget-object v12, v4, v7

    const/4 v13, 0x0

    .line 20
    :goto_12a
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v14

    if-ge v13, v14, :cond_14a

    invoke-virtual {v11, v13}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/ref/WeakReference;

    invoke-virtual {v14}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/text/style/ClickableSpan;

    invoke-virtual {v12, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_147

    invoke-virtual {v11, v13}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v12

    goto :goto_150

    :cond_147
    add-int/lit8 v13, v13, 0x1

    goto :goto_12a

    :cond_14a
    sget v12, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->びぐびあび:I

    add-int/lit8 v13, v12, 0x1

    sput v13, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->びぐびあび:I

    .line 21
    :goto_150
    new-instance v13, Ljava/lang/ref/WeakReference;

    aget-object v14, v4, v7

    invoke-direct {v13, v14}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v11, v12, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    aget-object v13, v4, v7

    move-object v14, v3

    check-cast v14, Landroid/text/Spanned;

    .line 22
    invoke-virtual {v2, v10}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->〺つふすそ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v15

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v15, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v9}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->〺つふすそ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v5, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v8}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->〺つふすそ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v14, v13}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v5, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v6}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->〺つふすそ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_124

    .line 23
    :cond_19a
    sget v3, Lづざかべべ/〳ぜぞぜべっ/くし〴〺ぅ;->tag_accessibility_actions:I

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1a8

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_1a8
    const/4 v5, 0x0

    .line 24
    :goto_1a9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v5, v3, :cond_1bb

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;

    invoke-virtual {v2, v3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ$げつ〴ぬぐ;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1a9

    :cond_1bb
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->づざかべべ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〳ぜぞぜべっ(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ$げつ〴ぬぐ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぺぁあねじ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
