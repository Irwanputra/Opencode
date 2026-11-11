.class public Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/dialogs/GroupSort;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/dialogs/GroupSort;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const p2, 0x7f0c0095

    const/16 p4, 0x8

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-ne p3, v0, :cond_d6

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 1
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざとぅぼこ〺:Landroid/widget/TextView;

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    const v3, 0x7f110334

    invoke-virtual {v2, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "JbgNg9K3fHcn\u001cfiNaiJ3kI7m\u00194>\u001979\u001b6"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 3
    iget-object v2, v2, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    .line 4
    invoke-virtual {v2}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->じぜこほぱ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "\u001d4f\u001b6mM3i\u001aehN`hIf:Lc9\u0019aoHeiA4oIc"

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 5
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざとぅぼこ〺:Landroid/widget/TextView;

    .line 6
    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 7
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉざぅち〻:Landroid/widget/LinearLayout;

    .line 8
    invoke-virtual {v0, p5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 9
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざっざへづ:Landroid/widget/Spinner;

    .line 10
    invoke-virtual {v0, p5}, Landroid/widget/Spinner;->setVisibility(I)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 11
    iget-object v0, v0, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->でどあくず:Landroid/widget/Spinner;

    .line 12
    invoke-virtual {v0, p4}, Landroid/widget/Spinner;->setVisibility(I)V

    iget-object p4, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 13
    iget-object v1, v1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v3, 0x0

    const-string v4, "Me;\u001ed>J0jI1=\u001cemO6oIfi@4jJdlHbl\u001ejlKel\u001dj:KboH1nAcnKjj\u001cbnJji\u001e`=\u0019aoOkjKg9Hj=KgkI0kLbm@jf\u001a6g\u001agj@c>Oa:A`:\u001dc;I7h\u001bjo\u001c`=\u001c0gH1k\u0019gi\u001eg:M0kO0=N7lAd<O6hLagO6i\u00191;Mfm@ei\u001baf@d;\u001c"

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_a0

    :cond_93
    invoke-interface {v3, p5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-nez v4, :cond_93

    :cond_a0
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 15
    invoke-direct {v0, p1, p2, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 16
    iput-object v0, p4, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->どぇぞほだ:Landroid/widget/ArrayAdapter;

    .line 17
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 18
    iget-object p2, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざっざへづ:Landroid/widget/Spinner;

    .line 19
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->どぇぞほだ:Landroid/widget/ArrayAdapter;

    .line 20
    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 21
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string p2, "@3:\u001egi\u001benK`nO39\u001ccj\u001d1kO3h\u001e`<\u001ddkHafJgh\u001dkhL6nNe>Mj<@1<O7jJegIk>Od<O"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 22
    invoke-interface {p1, p2, p5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    int-to-long p1, p1

    iget-object p4, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 23
    iget-object p4, p4, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉ〲なぱぽた:Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;

    .line 24
    invoke-virtual {p4}, Lてぜきぽく/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/いいにぽつ/げつ〴ぬぐ;->じぜこほぱ()J

    move-result-wide v0

    cmp-long p4, p1, v0

    if-gez p4, :cond_14f

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 25
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざっざへづ:Landroid/widget/Spinner;

    goto :goto_12f

    :cond_d6
    const/4 v0, 0x2

    if-ne p3, v0, :cond_133

    .line 26
    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 27
    iget-object v1, v1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざとぅぼこ〺:Landroid/widget/TextView;

    const v2, 0x7f110335

    .line 28
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 29
    iget-object v1, v1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざとぅぼこ〺:Landroid/widget/TextView;

    .line 30
    invoke-virtual {v1, p5}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 31
    iget-object v1, v1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉざぅち〻:Landroid/widget/LinearLayout;

    .line 32
    invoke-virtual {v1, p5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 33
    iget-object v1, v1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざっざへづ:Landroid/widget/Spinner;

    .line 34
    invoke-virtual {v1, p4}, Landroid/widget/Spinner;->setVisibility(I)V

    iget-object p4, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 35
    iget-object p4, p4, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->でどあくず:Landroid/widget/Spinner;

    .line 36
    invoke-virtual {p4, p5}, Landroid/widget/Spinner;->setVisibility(I)V

    iget-object p4, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    new-instance v1, Landroid/widget/ArrayAdapter;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v2, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 37
    iget-object v2, v2, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぇ〳〲〺すっ:[Ljava/lang/String;

    .line 38
    invoke-direct {v1, p1, p2, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 39
    iput-object v1, p4, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->どぇぞほだ:Landroid/widget/ArrayAdapter;

    .line 40
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 41
    iget-object p2, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->でどあくず:Landroid/widget/Spinner;

    .line 42
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->どぇぞほだ:Landroid/widget/ArrayAdapter;

    .line 43
    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 44
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    const-string p2, "HbgJ1;AkkMakA4<N1gLdoHa>OakK0jAj;Jg=IdnL0:L1m@`;Oj=Ig=H1hK4=L4lL"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 45
    invoke-interface {p1, p2, p5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ge p1, v0, :cond_14f

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 46
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->でどあくず:Landroid/widget/Spinner;

    .line 47
    :goto_12f
    invoke-virtual {p1, p5}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_14f

    :cond_133
    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 48
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざとぅぼこ〺:Landroid/widget/TextView;

    .line 49
    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 50
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ぉざぅち〻:Landroid/widget/LinearLayout;

    .line 51
    invoke-virtual {p1, p4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 52
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->ざっざへづ:Landroid/widget/Spinner;

    .line 53
    invoke-virtual {p1, p4}, Landroid/widget/Spinner;->setVisibility(I)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/dialogs/GroupSort$げつ〴ぬぐ;->〺つふすそ:Lteam/dev/epro/apkcustom/dialogs/GroupSort;

    .line 54
    iget-object p1, p1, Lteam/dev/epro/apkcustom/dialogs/GroupSort;->でどあくず:Landroid/widget/Spinner;

    .line 55
    invoke-virtual {p1, p4}, Landroid/widget/Spinner;->setVisibility(I)V

    .line 56
    :cond_14f
    :goto_14f
    sget-object p1, Lteam/dev/epro/apkcustom/App;->びぐびあび:Landroid/content/SharedPreferences;

    .line 57
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string p2, "@fhM7jNk9\u001d4i\u0019a>Nj9M`nOk:\u001efoK`k@`"

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
